package com.ja.ossbe.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Table(name = "products")
@JsonIgnoreProperties("orders")
public class Product  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private Double price;
    private Long quantity;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "products")
    private List<Order> orders;
    public Product() {
    }
    public List<Order> addOrder(Order order){
        if (orders == null){
            orders = new ArrayList<Order>();
        }
        orders.add(order);
        return orders;
    }
}
