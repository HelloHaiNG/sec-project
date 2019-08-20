package com.concurrency.concurrencyproject.service;

import com.concurrency.concurrencyproject.config.MyRabbitMQConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liaohong
 * @since 2019/8/20 10:31
 */
@Service
public class MQStockService {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private StockService stockService;

    /**
     * 监听库存消息队列，并消费
     *
     * @param stockName
     */
    @RabbitListener(queues = MyRabbitMQConfig.STORY_QUEUE)
    public void decrByStock(String stockName) {
        LOGGER.info("库存消息队列收到的消息商品信息是：{}", stockName);
        /**
         * 调用数据库service给数据库对应商品库存减一
         */
        stockService.decrByStock(stockName);
    }
}
