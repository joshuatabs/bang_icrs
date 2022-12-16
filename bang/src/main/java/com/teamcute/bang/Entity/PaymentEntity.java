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
	
	private String amount;
	
	@Column(name = "created_date")
	private String createdDate;
	
	
	public PaymentEntity(){}


	public PaymentEntity(int paymentID, String type, String amount) {
		super();
		this.paymentid = paymentID;
		this.amount = amount;
		this.type = type;
	}
	
	@PrePersist
	public void setCreatedDate() {
		this.createdDate = LocalDate.now().toString();
	}
	
	public String getCreateDate() {
		return createdDate;
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
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String getAmount() {
		return amount;
	}
	
	
	
}
