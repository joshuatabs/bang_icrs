package com.teamcute.bang.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_venue")
public class VenueEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int venueid;
	
	private int paymentid;
	
	@Column(name = "date")
	private String date;
	
	
	
	public VenueEntity() {}
	
	public VenueEntity(int venueid, int paymentid, String date) {
		super();
		this.venueid = venueid;
		this.paymentid = paymentid;
		this.date = date;
	}

	@PrePersist
	public void setDate() {
		this.date = LocalDate.now().toString();
	}

	public int getVenueid() {
		return venueid;
	}

	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getDate() {
		return date;
	}

	
}
