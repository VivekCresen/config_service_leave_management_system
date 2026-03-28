package com.cresensolutions.configservice.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void shouldReturnHelloMessage() {
        HelloController controller = new HelloController();

        String message = controller.hello();

        assertEquals("Hello from Config Service microservice", message);
    }
}
