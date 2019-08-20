package com.concurrency.concurrencyproject;

import com.concurrency.concurrencyproject.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.concurrency.concurrencyproject.mapper")
public class ConcurrencyProjectApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConcurrencyProjectApplication.class, args);
    }

    @Autowired
    private RedisService redisService;

    /**
     * redis初始化各商品的库存量
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        redisService.put("watch", 10, 20);
    }
}
