package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HelloControllerTest {

    @Test
    void testHelloMessage() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertThat(result).isEqualTo("Hello, CI/CD with Spring Boot + DevTools!");
    }
}

