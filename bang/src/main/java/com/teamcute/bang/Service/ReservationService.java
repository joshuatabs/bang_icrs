package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.ReservationEntity;
import com.teamcute.bang.Repository.ReservationRepository;



@Service
public class ReservationService {
	@Autowired
	ReservationRepository rtrepo;
	//C	
	public ReservationEntity insertReservation(ReservationEntity reservation) {
		return rtrepo.save(reservation);
	}
	
	//R
	public List<ReservationEntity> getAllReservations(){
		return rtrepo.findAll();
	}
	public ReservationEntity findByRoomId (String roomid) {
		if(rtrepo.findByRoomId(roomid) !=null)
			return rtrepo.findByRoomId(roomid);
		else
			return null;
	}
	//U
	public ReservationEntity putReservation(int id, ReservationEntity newReservationDetails) throws Exception{
		ReservationEntity reservation = new ReservationEntity();
		
		try {
			reservation = rtrepo.findById(id).get();
			reservation.setDate(newReservationDetails.getDate());
			return rtrepo.save(reservation);
		}
		catch (NoSuchElementException nex) {
			throw new Exception("Reservation ID" + id + "does not exist@");
		}
	}
	//D
	public String deleteReservation(int id) {
		String msg;
		if(rtrepo.findById(id)!=null) {
			rtrepo.deleteById(id);
			msg="Reservation ID number" + id + "is successfully deleted!";
		}
		else
			msg = "Reservation ID number" +id + "is not found";
		return msg;
	}
}