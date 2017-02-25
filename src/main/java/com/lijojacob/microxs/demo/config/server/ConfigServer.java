package com.lijojacob.microxs.demo.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lijojacob on 2/24/17.
 */
@SpringBootApplication(scanBasePackages = "com.lijojacob.microxs.demo.config")
@EnableConfigServer
public class ConfigServer {

    public static void main(String[] args) {
        // Tell Boot to look for config-service.yml
        System.setProperty("spring.config.name", "config-service");
        SpringApplication.run(ConfigServer.class, args);
    }

}
