package com.github.harshild;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RibbonClient(name = "spring-cloud-app-server",
        configuration = RibbonServiceConfig.class)
@RefreshScope
public class EurekaController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/greeting")
    String greeting(){
        return "Hello from EurekaClient! "+foo;
    }

    @RequestMapping("/info")
    String info() {
        return "Connected!";
    }
}


class RibbonServiceConfig {
    @Autowired
    IClientConfig ribbonClientConfig;
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}