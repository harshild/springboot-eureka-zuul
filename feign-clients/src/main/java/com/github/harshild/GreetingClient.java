package com.github.harshild;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient{

    @RequestMapping(method = RequestMethod.GET, path =  "/get-greeting")
    String greeting();
}
