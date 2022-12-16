package com.teamcute.bang.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_venue")
public class VenueEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venueid;
	
	@Column(name = "date")
	private String date;
	
    @ManyToOne
    @JoinColumn(name="paymentid")
    PaymentEntity payment;
	
	public VenueEntity() {}
	
	public VenueEntity(int venueid, PaymentEntity payment, String date) {
		super();
		this.venueid = venueid;
		this.payment = payment;
		this.date = date;
	}

	@PrePersist
	public void setDate() {
		this.date = LocalDate.now().toString();
	}

	public int getVenueid() {
		return venueid;
	}

	public PaymentEntity getPayment() {
		return payment;
	}

	public void setPayment(PaymentEntity payment) {
		this.payment = payment;
	}

	public String getDate() {
		return date;
	}

	
}