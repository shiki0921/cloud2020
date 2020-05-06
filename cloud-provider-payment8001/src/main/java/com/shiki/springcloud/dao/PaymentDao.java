package com.shiki.springcloud.dao;

import com.shiki.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shiki
 * @title:
 * @projectName cloud2020
 * @description: TODO
 * @date 2020/5/4 10:30
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
