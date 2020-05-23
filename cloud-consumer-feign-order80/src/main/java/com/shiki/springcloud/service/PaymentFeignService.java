package com.shiki.springcloud.service;

import com.shiki.springcloud.entities.CommonResult;
import com.shiki.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shiki
 * @title:
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/5/11 21:30
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //找哪个微服务
public interface PaymentFeignService {

    @GetMapping(value="/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) ;

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() ;

}
