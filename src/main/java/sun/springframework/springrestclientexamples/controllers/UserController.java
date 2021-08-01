package sun.springframework.springrestclientexamples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import sun.springframework.api.domain.User;
import sun.springframework.springrestclientexamples.services.ApiService;

import java.util.List;

@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"","/","/index"})
    public String index(){
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange){
        Mono<MultiValueMap<String, String>> data = serverWebExchange.getFormData();

        Mono<List<User>> users = data.map(formdata -> {
            Integer limit = Integer.valueOf(formdata.get("limit").get(0));
            //setting default value for limit
            if (limit == null || limit == 0) {
                limit = 10;
            }
            //return limit;
            return apiService.getUsers(limit);
        });
        model.addAttribute("users",users);
        return "userlist";
    }
}
