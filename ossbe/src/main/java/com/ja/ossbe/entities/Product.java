package com.ja.ossbe.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product  implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String price;
    private Long quantity;
    private String name;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private List<OrderProducts> ordersProducts;

    public Product() {
    }
}
