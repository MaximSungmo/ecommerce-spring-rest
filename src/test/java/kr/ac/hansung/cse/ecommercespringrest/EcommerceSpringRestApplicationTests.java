package kr.ac.hansung.cse.ecommercespringrest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class EcommerceSpringRestApplicationTests {

    @Autowired
    PasswordEncoder passwordEncoder;


    @Test
    void contextLoads() {
        String password = passwordEncoder.encode("charliepw");
        System.out.println(password);
    }

}
