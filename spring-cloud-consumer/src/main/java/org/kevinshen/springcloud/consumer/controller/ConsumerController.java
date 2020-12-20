package org.kevinshen.springcloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "toHello", method = RequestMethod.GET)
    public String toHello() {
        return restTemplate.getForEntity("http://PRODUCT-SERVER/hello", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "ribbonError")
    @RequestMapping(value = "toHello2", method = RequestMethod.GET)
    public String toHello2() {
        return restTemplate.getForEntity("http://PRODUCT-SERVER/hello2", String.class).getBody();
    }

    public String ribbonError() {
        return "ribbon error";
    }
}
