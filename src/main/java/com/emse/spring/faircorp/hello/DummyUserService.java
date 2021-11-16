package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

@Service
public class DummyUserService implements UserService {

    @Autowired
    private GreetingService greetingService;

    @Override
    public void greetAll() {
        List<String> tmp = new LinkedList<>();
        tmp.add("Elodie");
        tmp.add("Charles");
        for (String i : tmp) {
            greetingService.greet(i);
        }
    }
}
