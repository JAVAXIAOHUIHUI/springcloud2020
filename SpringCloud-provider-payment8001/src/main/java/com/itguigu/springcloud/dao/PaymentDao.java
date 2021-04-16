package com.itguigu.springcloud.dao;

/**
 * @AUTHOR HU
 * @DATE 年04月16日21:58
 */

import com.itguigu.springcloud.emtities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hu
 */
@Mapper
public interface PaymentDao {
    /**
     * 新增
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询订单类
     * @param paymentId
     * @return
     */
    public Payment getPaymentById(@Param("paymentId") Long paymentId);

}
