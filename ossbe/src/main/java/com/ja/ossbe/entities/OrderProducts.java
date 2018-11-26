package com.ja.ossbe.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "order_products")
public class OrderProducts {
    private Integer orderId;
    private Integer productId;
}
