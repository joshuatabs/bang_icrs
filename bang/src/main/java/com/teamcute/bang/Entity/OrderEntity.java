package com.teamcute.bang.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Order")
public class OrderEntity {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderid;
    private int customerid;
    private int orderdate;
    
    @OneToMany(cascade = CascadeType.MERGE)
    private Set<FoodEntity> food;
    
	public OrderEntity() {
		//default
	}
   
    
    public OrderEntity(int orderid, int customerid, int orderdate, Set<FoodEntity> food) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
		this.orderdate = orderdate;
		this.food = food;
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

	public Set<FoodEntity> getFood() {
		return food;
	}

	public void setFood(Set<FoodEntity> food) {
		this.food = food;
	}
    
}
