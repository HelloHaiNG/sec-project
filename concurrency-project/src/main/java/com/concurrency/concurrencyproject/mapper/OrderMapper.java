package com.concurrency.concurrencyproject.mapper;

import com.concurrency.concurrencyproject.base.service.GenericMapper;
import com.concurrency.concurrencyproject.model.Order;
import org.springframework.stereotype.Service;

/**
 * @author liaohong
 * @since 2019/8/19 11:50
 */
@Service
public interface OrderMapper extends GenericMapper<Order> {
}
