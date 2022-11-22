package com.teamcute.bang.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Order")
public class OrderEntity {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderid;
    private int customerid;
    private int orderdate;
    private int foodid;
    
	public OrderEntity() {
		//default
	}
    public OrderEntity(int orderid, int customerid, int orderdate, int foodid) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.orderdate = orderdate;
		this.foodid = foodid;
	}
    
    public int getOrderid() {
        return orderid;
    }
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    public int getCustomerid() {
        return customerid;
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }
    public int getOrderdate() {
        return orderdate;
    }
    public void setOrderdate(int orderdate) {
        this.orderdate = orderdate;
    }
    public int getFoodid() {
        return foodid;
    }
    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }
    
}
