package com.github.harshild;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
    @RequestMapping("/greeting")
    String greeting(){
        return "Hello from EurekaClient!";
    }

    @RequestMapping("/info")
    String info() {
        return "Connected!";
    }
}
