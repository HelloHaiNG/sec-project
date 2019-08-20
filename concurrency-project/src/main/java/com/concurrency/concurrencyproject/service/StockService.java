package com.concurrency.concurrencyproject.service;

/**
 * @author liaohong
 * @since 2019/8/20 10:28
 */
public interface StockService {

    void decrByStock(String stockName);

    Integer selectByExample(String stockName);
}
