package com.teamcute.bang.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_room")
public class RoomEntity {
	//Art Emmanuel L. Ilustrisimo
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomid;
	
	private String code;
	private int floor;
	
	public RoomEntity() {}

	public RoomEntity(int roomid, String code, int floor) {
		super();
		this.roomid = roomid;
		this.code = code;
		this.floor = floor;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
}