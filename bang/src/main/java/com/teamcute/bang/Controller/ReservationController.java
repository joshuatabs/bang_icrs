package com.teamcute.bang.Controller;

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

import com.teamcute.bang.Entity.ReservationEntity;
import com.teamcute.bang.Service.ReservationService;



@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	ReservationService rtserv;
	@PostMapping("/postReservations")
	public ReservationEntity insertReservation(@RequestBody ReservationEntity reservation) {
		return rtserv.insertReservation(reservation);
	}
	
	@GetMapping("/getAllReservations")
	public List<ReservationEntity> getAllReservations(){
		return rtserv.getAllReservations();
	}
	@GetMapping("/getByRoomId")
	public ReservationEntity findByRoomId(@RequestParam String roomid) {
		return rtserv.findByRoomId(roomid);
	}
	
	@PutMapping("/putReservation")
	public ReservationEntity putReservation(@RequestParam int id, @RequestBody ReservationEntity newCourseDetails) throws Exception{
		return rtserv.putReservation(id, newCourseDetails);

	}
	@DeleteMapping("/deleteReservation/{id}")
	public String deleteReservation(@PathVariable int id) {
		return rtserv.deleteReservation(id);
	}

}
