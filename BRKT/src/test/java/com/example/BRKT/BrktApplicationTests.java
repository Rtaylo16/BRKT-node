package com.example.BRKT;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BrktApplicationTests {

    @Autowired
    private MyService myService;

    @Test
    public void testMyService() {
        String result = myService.getMessage();
        assertEquals("Hello, world!", result);
    }
}
