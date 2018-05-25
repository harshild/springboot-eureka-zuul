package com.github.harshild;

import org.springframework.web.bind.annotation.RequestMapping;

public interface EurekaController {

    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/info")
    String info() ;
}
