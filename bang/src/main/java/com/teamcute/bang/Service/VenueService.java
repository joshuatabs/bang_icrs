package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamcute.bang.Entity.VenueEntity;
import com.teamcute.bang.Entity.PaymentEntity;
import com.teamcute.bang.Repository.PaymentRepository;
import com.teamcute.bang.Repository.VenueRepository;

@Service
public class VenueService {
	
	@Autowired
	VenueRepository vr;
	
	@Autowired
	PaymentRepository pr;
	
	//Create New Venue Reservation
	public VenueEntity newVenue(VenueEntity venue, PaymentEntity payment) {
		
		pr.save(payment);
		venue.setPaymentid(payment.getPaymentID());
		
		return vr.save(venue);
		
	}
	
	//Read Venues
	public List<VenueEntity> getVenues(){
		return vr.findAll();
	}
	
	//Update Venue
	public VenueEntity updateVenue(int venueid, VenueEntity newVenueDetails) throws Exception{
		
		VenueEntity venue = new VenueEntity();
		
		try {
			
			venue = vr.findById(venueid).get();
			
			venue.setDate();
			
			return vr.save(venue);
			
		}catch(NoSuchElementException nex){
			throw new Exception("ID number " +venueid+ "does not exist!");
		}
	}
	
	//Delete Venue
	public String deleteVenue(int venueid) {
		
		String msg;
		
		VenueEntity venue = vr.findById(venueid).get();
		
		int paymentid = venue.getPaymentid();
		
		if(vr.findByvenueid(venueid) != null){
			
			vr.deleteById(venueid);
			pr.deleteById(paymentid);
			
			msg = "Venue Reservation Number " +venueid+ " has been successfully deleted!";
			
		}else{
			
			msg = "Veneue Reservation with ID " +venueid+ " cannot be found!";
			
		}
		
		return msg;
	}

}
