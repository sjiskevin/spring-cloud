package org.kevinshen.springcloud.feign.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeignProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProductApplication.class, args);
    }
}
