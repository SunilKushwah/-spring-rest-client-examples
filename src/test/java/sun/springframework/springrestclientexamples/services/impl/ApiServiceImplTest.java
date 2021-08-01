package sun.springframework.springrestclientexamples.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import sun.springframework.api.domain.User;
import sun.springframework.springrestclientexamples.services.ApiService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApiServiceImplTest {
    @Autowired
    private ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getUsers() {
        List<User> users = apiService.getUsers(1);
        assertEquals(1,users.size());
    }
}