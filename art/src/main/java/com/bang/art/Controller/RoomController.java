package com.bang.art.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bang.art.Entity.RoomEntity;
import com.bang.art.Service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	RoomService rserv;
	
	//Create or insert a Room
		@PostMapping("/postRoom")
		public RoomEntity insertRoom(@RequestBody RoomEntity Room){
			return rserv.insertRoom(Room);
		}
		
		//Read all Rooms
		@GetMapping("/getAllRoom")
		public List<RoomEntity> getRoom(){
			return rserv.getRoom();
		}
		
		//Read a record by Code
		@GetMapping("/getByCode")
		public RoomEntity findByCode(@RequestParam String code) {
			return rserv.findByCode(code);
		}
		
		//Update Room Record
		@PutMapping("/putRoom")
		public RoomEntity putRoom(@RequestParam int roomid, @RequestBody RoomEntity newRoomDetails) throws Exception{
			return rserv.putRoom(roomid, newRoomDetails);
		};
		
		//Delete a Room
		@DeleteMapping("/deleteRoom/{roomid}")
		public String deleteRoom(@PathVariable int roomid) {
			return rserv.deleteRoom(roomid);
		}

}
