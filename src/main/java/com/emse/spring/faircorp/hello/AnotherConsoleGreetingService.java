package com.emse.spring.faircorp.hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AnotherConsoleGreetingService implements GreetingService {
    public void greet(String name) {
        System.out.println("Bonjour, " + name + "!");
    }
}
