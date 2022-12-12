package com.teamcute.bang.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_reservation")
public class ReservationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String roomId;
	private Date date;
	private Time time;
	
	public ReservationEntity() {}
	
	public ReservationEntity(int id, Date date, Time time, String roomId) {
		super();
		this.id=id;
		this.date=date;
		this.time=time;
		this.roomId=roomId;
		
	}
	public int getId() {
		return id;
		
	}
	public String  getRoomId() {
		return roomId;
		
	}
	public Date getDate() {
		return date;
		
	}
	public Time getTime() {
		return time;
		
	}
	
	
	public void setDate(Date date) {
		this.date=date;
	}
	public void setTime(Time time) {
		this.time=time;
	}
	public void setRoomId(String roomId) {
		this.roomId=roomId;
	}
	
}
