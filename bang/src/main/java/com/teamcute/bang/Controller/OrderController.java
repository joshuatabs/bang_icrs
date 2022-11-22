package com.teamcute.bang.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamcute.bang.Entity.OrderEntity;
import com.teamcute.bang.Service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
    
    @Autowired
    OrderService orderServ;
    
    @PostMapping("/postOrder")
    public OrderEntity insertOrder(@RequestBody OrderEntity order) {
        return orderServ.insertOrder(order);
    }
    
    //read all
    
    @GetMapping("/getAllOrders")
    public List<OrderEntity> getAllOrders() {
        return orderServ.getAllOrders();
    }
    
    
    @DeleteMapping("deleteOrder/{id}")
    public String deleteOrder(@PathVariable int id) {
        return orderServ.deleteOrder(id);
    }
  
}    