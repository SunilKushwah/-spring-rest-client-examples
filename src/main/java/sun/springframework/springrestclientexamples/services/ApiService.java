package sun.springframework.springrestclientexamples.services;

import sun.springframework.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(int limit);

}
