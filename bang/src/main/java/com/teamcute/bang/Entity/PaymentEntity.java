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
	private int paymentID;
	
	private int OrderID;
	private int ReservationID;
	private String Type;
	
	
	public PaymentEntity(){}


	public PaymentEntity(int paymentID, int orderID, int reservationID, String type) {
		super();
		this.paymentID = paymentID;
		OrderID = orderID;
		ReservationID = reservationID;
		Type = type;
	}


	public int getPaymentID() {
		return paymentID;
	}


	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}


	public int getOrderID() {
		return OrderID;
	}


	public void setOrderID(int orderID) {
		OrderID = orderID;
	}


	public int getReservationID() {
		return ReservationID;
	}


	public void setReservationID(int reservationID) {
		ReservationID = reservationID;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}
	
	
	
}
