package com.concurrency.concurrencyproject.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author liaohong
 * @since 2019/8/19 11:46
 */
@Table(name = "t_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -8867272732777764701L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_name")
    private String order_name;

    @Column(name = "order_user")
    private String order_user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getOrder_user() {
        return order_user;
    }

    public void setOrder_user(String order_user) {
        this.order_user = order_user;
    }
}
