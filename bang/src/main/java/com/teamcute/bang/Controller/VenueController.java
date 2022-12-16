package com.teamcute.bang.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teamcute.bang.Entity.PaymentEntity;
import com.teamcute.bang.Entity.VenueEntity;
import com.teamcute.bang.Service.VenueService;

@RestController
@RequestMapping("/venue")
public class VenueController {
	
	@Autowired
	VenueService vs;
	VenueEntity ve;
	
	//Create New Venue Reservation
	@PostMapping("/newVenue")
	public VenueEntity newVenue(VenueEntity venue, @RequestBody PaymentEntity payment) {
		payment.setType("Rent Venue");
		
		return vs.newVenue(venue, payment);
	}
	
	//Get All Venue Reservations
	@GetMapping("/getVenues")
	public List<VenueEntity> getVenues(){
		return vs.getVenues();
	}
	
	//Update Venue Reservation
	public VenueEntity updateVenue(@RequestParam int venueid, @RequestBody VenueEntity newVenueDetails) throws Exception{
		return vs.updateVenue(venueid, newVenueDetails);
	}
	
	//Delete Venue Reservation
	@DeleteMapping("/deleteVenue/{venueid}")
	public String deleteVenue(@PathVariable int venueid) {
		return vs.deleteVenue(venueid);
	}

}
