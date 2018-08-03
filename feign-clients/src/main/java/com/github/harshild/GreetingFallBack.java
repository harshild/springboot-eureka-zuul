package com.github.harshild;

import org.springframework.stereotype.Component;

@Component
public class GreetingFallBack implements GreetingClient {
    @Override
    public String greeting() {
        return "Server Not Reachable";
    }

    @Override
    public String greeting_new() {
        return "Wrong URL test";
    }
}
