package com.concurrency.concurrencyproject.base.service;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author liaohong
 * @since 2019/8/19 11:11
 */
public interface GenericMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

