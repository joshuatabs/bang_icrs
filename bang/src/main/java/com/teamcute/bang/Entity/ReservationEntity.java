package com.teamcute.bang.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "table_reservation")
public class ReservationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationid;
	
	
	private Date date;
	
	private String time;
	
	@ManyToOne
	@JoinColumn(name="roomid")
	RoomEntity room;
	
	@ManyToOne
	@JoinColumn(name="userid")
	UserEntity user;
	
	@ManyToOne
	@JoinColumn(name="paymentid")
	PaymentEntity payment;
	
	
	public ReservationEntity() {}
	
	public ReservationEntity(int reservationid, Date date, String time, UserEntity user, PaymentEntity payment,RoomEntity room ) {
		super();
		this.reservationid=reservationid;
		this.date=date;
		this.time=time;
		this.user=user;
		this.payment=payment;
		this.room=room;
		
	}
	
	public int getReservationid() {
		return reservationid;
		
	}
	
	public Date getDate() {
		return date;
		
	}
	public String getTime() {
		return time;
		
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public UserEntity getUser(){
			return user;
		}
	public void setUser(UserEntity user) {
		this.user= user;
		}
	
	public PaymentEntity getPayment(){
		return payment;
	}
	
	public void setPayment(PaymentEntity payment) {
		this.payment= payment;
		}
	
	public RoomEntity getRoom(){
		return room;
	}
	public void setRoom(RoomEntity room) {
		this.room = room;
	}
	
}
