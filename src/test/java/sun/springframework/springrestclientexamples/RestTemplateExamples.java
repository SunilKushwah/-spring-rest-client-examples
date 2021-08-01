package sun.springframework.springrestclientexamples;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import sun.springframework.springrestclientexamples.services.ApiService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RestTemplateExamples {
    public static  final String API_ROOT = "https://api.predic8.de:443/shop";

    @Test
    public  void  getCategories(){
        String api_url = API_ROOT+"/categories/";
        RestTemplate restTemplate = new RestTemplate();

        JsonNode jsonNode = restTemplate.getForObject(api_url,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }

    @Test
    public void getCustomers(){
        String api_url = API_ROOT+"/customers/";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(api_url,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }

    @Test
    public void createCustomer(){
        String api_url = API_ROOT+"/customers/";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "sun");
        postMap.put("lastname", "cool");
        JsonNode jsonNode = restTemplate.postForObject(api_url,postMap,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }

    @Test
    public void updateCustomer(){
        String api_url = API_ROOT+"/customers/";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "sun_1");
        postMap.put("lastname", "cool_1");

        JsonNode jsonNode = restTemplate.postForObject(api_url,postMap,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());

        String customerUrl = jsonNode.get("customer_url").textValue();
        String id = customerUrl.split("/")[3];

        System.out.println("Created customer Id:"+id);

        postMap.put("firstname", "sun_2");
        postMap.put("lastname", "cool_2");

        restTemplate.put(api_url + id,postMap);

        JsonNode updateNode = restTemplate.getForObject(api_url+id,JsonNode.class);

        System.out.println("UpdatedResponse");
        System.out.println(updateNode.toString());

    }

    @Test
    public void deleteCustomer(){
        String api_url = API_ROOT+"/customers/";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "sun_1");
        postMap.put("lastname", "cool_1");

        JsonNode jsonNode = restTemplate.postForObject(api_url,postMap,JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());

        String customerUrl = jsonNode.get("customer_url").textValue();
        String id = customerUrl.split("/")[3];

        System.out.println("Created customer Id:"+id);

        restTemplate.delete(api_url + id);

        System.out.println("Customer deleted");

        //should give error 404.
        restTemplate.getForObject(api_url+id,JsonNode.class);

    }
}
