package com.ja.ossbe.services;

import com.ja.ossbe.entities.Client;
import com.ja.ossbe.entities.Order;
import com.ja.ossbe.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Component
public class App {
    @Autowired
    private IProductServices productServices;
    @Autowired
    private IOrderServices orderServices;
    @Autowired
    private IClientServices clientServices;


    public void myApp(){

        Client jclient = new Client("John","Son","john@son","Pass");
        Client pclient = new Client("Pepe","Son","pepe@son","PassW");

        Order pOrder =  new Order();
        Order jOrder =  new Order();


        Product p1 = productServices.getProduct(1);
        Product p2 = productServices.getProduct(2);
        Product p3 = productServices.getProduct(3);


        List<Product> jProductList = new ArrayList<>();
        List<Product> pProductList = new ArrayList<>();

        jProductList.add(p1);
        jProductList.add(p2);

        pProductList.add(p1);
        pProductList.add(p3);

        jOrder.addProduct(jProductList);
        pOrder.addProduct(pProductList);

        pOrder.addClient(pclient);
        jOrder.addClient(jclient);

        System.out.println("Client J " +jclient);
        System.out.println("Client P " +pclient);

        System.out.println("Order J "+ jOrder);
        System.out.println("Order P "+ pOrder);

//        clientServices.saveClient(jclient);
//        clientServices.saveClient(pclient);
//        orderServices.saveOrder(jOrder);

        System.out.println("*************************************************");
        Client client1 = clientServices.getClient(1);
        Client client2 = clientServices.getClient(2);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(client1.getOrders());
        System.out.println(client1.getOrders().get(0).getProducts());

    }

}
