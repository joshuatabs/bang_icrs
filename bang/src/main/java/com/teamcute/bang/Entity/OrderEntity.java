package com.teamcute.bang.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Order")
public class OrderEntity {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderid;
    private int orderdate;
    private double total;
    @ManyToOne
	@JoinColumn(name = "userid")
    UserEntity user;
    
	public OrderEntity() {
		//default
	}
  
	public OrderEntity(int orderid, int orderdate, double total, UserEntity user) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.total = total;
		this.user = user;
	}

	public int getOrderid() {
        return orderid;
    }
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getOrderdate() {
        return orderdate;
    }
    public void setOrderdate(int orderdate) {
        this.orderdate = orderdate;
    }

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

 
}
