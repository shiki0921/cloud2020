package com.shiki.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shiki
 * @title:
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/5/7 22:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8006.class,args);
    }
}