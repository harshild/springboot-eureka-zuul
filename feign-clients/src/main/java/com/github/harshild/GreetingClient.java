package com.github.harshild;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spring-cloud-eureka-client",fallback = GreetingFallBack.class)
public interface GreetingClient{

    @RequestMapping(method = RequestMethod.GET, path =  "/greeting")
    String greeting();

    @RequestMapping(method = RequestMethod.GET, path =  "/greeting")
    String greeting_new();
}
