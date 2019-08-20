package com.concurrency.concurrencyproject.service;

import com.concurrency.concurrencyproject.model.Order;

/**
 * @author liaohong
 * @since 2019/8/20 10:25
 */
public interface OrderService {

    void createOrder(Order order);
}
