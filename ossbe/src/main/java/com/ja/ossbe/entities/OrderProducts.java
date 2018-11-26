package com.ja.ossbe.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_products")
public class OrderProducts {
    @Id
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product product;
}
