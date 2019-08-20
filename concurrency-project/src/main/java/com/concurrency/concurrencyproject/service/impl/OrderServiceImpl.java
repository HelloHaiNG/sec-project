package com.concurrency.concurrencyproject.service.impl;

import com.concurrency.concurrencyproject.mapper.OrderMapper;
import com.concurrency.concurrencyproject.model.Order;
import com.concurrency.concurrencyproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaohong
 * @since 2019/8/20 10:27
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.insert(order);
    }
}
