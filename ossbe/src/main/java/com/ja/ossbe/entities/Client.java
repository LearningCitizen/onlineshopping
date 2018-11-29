package com.ja.ossbe.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private List<Order> orders;

    public List<Order> addOrder(Order order){
        if (orders == null){
            orders = new ArrayList<Order>();
        }
        order.addClient(this);
        orders.add(order);
        return orders;
    }

    public Client() {
    }
}
