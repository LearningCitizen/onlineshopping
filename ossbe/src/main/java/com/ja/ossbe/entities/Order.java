package com.ja.ossbe.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "orders")
public class Order implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    List<OrderProducts> ordersProducts;

    public void addClient(Client c){
        this.client = c;
    }

    public Order() {
    }
}
