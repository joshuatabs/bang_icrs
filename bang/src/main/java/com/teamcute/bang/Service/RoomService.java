package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.RoomEntity;
import com.teamcute.bang.Repository.RoomRepository;


@Service
public class RoomService {
	@Autowired
	RoomRepository rrepo;
	
	//C - Create or insert a room code
	public RoomEntity insertRoom(RoomEntity code) {
		return rrepo.save(code);
	}
	
	//R - Read all the records in the db
		public List<RoomEntity> getRoom(){
			return rrepo.findAll();
		}
	
	//R - Read or search by code
	public RoomEntity findByCode(String code) {
		if(rrepo.findByCode(code) != null)
			return rrepo.findByCode(code);
		else
			return null;		
	}
	
	//U - Update a room record
	public RoomEntity putRoom(int roomid, RoomEntity newRoomDetails) throws Exception{
		RoomEntity room = new RoomEntity();
		
		try {
			room = rrepo.findById(roomid).get();
			
			room.setCode(newRoomDetails.getCode()); 
			room.setFloor(newRoomDetails.getFloor());
			
			return rrepo.save(room);
		}catch(NoSuchElementException nex) {
			throw new Exception("Room ID number " + roomid + " does not exist!");
		}
	}
	
	//D - Delete a room record
	public String deleteRoom(int roomid) {
		String msg;
		if(rrepo.findById(roomid) != null) {
			rrepo.deleteById(roomid);
			
			msg = "Room ID number " + roomid + " is successfuly deleted!";
		}
		else
			msg = "Room ID number " + roomid + " is not found!";
		return msg;
	}
}