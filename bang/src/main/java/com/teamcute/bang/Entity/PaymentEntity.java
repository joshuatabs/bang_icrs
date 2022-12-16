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
	
	private String type;
	
	
	public PaymentEntity(){}


	public PaymentEntity(int paymentID, String type) {
		super();
		this.paymentid = paymentID;
		this.type = type;
	}


	public int getPaymentID() {
		return paymentid;
	}


	public void setPaymentID(int paymentID) {
		this.paymentid = paymentID;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
