package sun.springframework.springrestclientexamples.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sun.springframework.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(int limit);
    Flux<User> getUsers(Mono<Integer> limit);

}
