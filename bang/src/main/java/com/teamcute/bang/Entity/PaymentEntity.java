package com.teamcute.bang.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_payment")
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;
	
	private int orderid;
	private int reservationid;
	private String type;
	
	
	public PaymentEntity(){}


	public PaymentEntity(int paymentID, int orderID, int reservationID, String type) {
		super();
		this.paymentid = paymentID;
		orderid = orderID;
		reservationid = reservationID;
		this.type = type;
	}


	public int getPaymentID() {
		return paymentid;
	}


	public void setPaymentID(int paymentID) {
		this.paymentid = paymentID;
	}


	public int getOrderID() {
		return orderid;
	}


	public void setOrderID(int orderID) {
		orderid = orderID;
	}


	public int getReservationID() {
		return reservationid;
	}


	public void setReservationID(int reservationID) {
		reservationid = reservationID;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
