package com.server.demo.seater.storage;

import io.seata.config.springcloud.EnableSeataSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/21
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableSeataSpringConfig
public class DemoStorageApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoStorageApp.class, args);
    }
}