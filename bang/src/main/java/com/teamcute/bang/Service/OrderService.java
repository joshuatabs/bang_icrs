package com.teamcute.bang.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.OrderEntity;
import com.teamcute.bang.Repository.OrderRepository;


@Service
public class OrderService {
    @Autowired
    OrderRepository orepo;
    
    public OrderEntity insertOrder(OrderEntity order) {
        return orepo.save(order);
    }
    
    //read all
    
    public List<OrderEntity> getAllOrders() {
        return orepo.findAll();
    }
    
    //delete order
    public String deleteOrder(int id) {
        String msg;
        
        if(orepo.findById(id) != null) {
            orepo.deleteById(id);
            msg = "Order Successfully Deleted! Order Num: " + id;
        } else {
            msg = "Order ID not found!";
        }
        
        return msg;
    }
    



   
    //not going to be implementing an UPDATE function because it may affect the relationships later on
}
