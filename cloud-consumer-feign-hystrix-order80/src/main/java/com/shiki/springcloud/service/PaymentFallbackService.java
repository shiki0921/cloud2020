package com.shiki.springcloud.service;

/**
 * @author shiki
 * @title:
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/5/24 21:26
 */
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
