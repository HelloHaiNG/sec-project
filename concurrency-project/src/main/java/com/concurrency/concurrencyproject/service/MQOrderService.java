package com.concurrency.concurrencyproject.service;

import com.concurrency.concurrencyproject.config.MyRabbitMQConfig;
import com.concurrency.concurrencyproject.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaohong
 * @since 2019/8/20 10:44
 */
@Service
public class MQOrderService {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderService orderService;

    /**
     * 监听订单消息队列，并消费
     *
     * @param order
     */
    @RabbitListener(queues = MyRabbitMQConfig.ORDER_QUEUE)
    public void createOrder(Order order) {
        LOGGER.info("收到订单消息，订单用户为：{}，商品名称为：{}", order.getOrder_user(), order.getOrder_name());
        /**
         * 调用数据库orderService创建订单信息
         */
        orderService.createOrder(order);
    }
}
