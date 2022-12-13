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

import com.teamcute.bang.Entity.PaymentEntity;
import com.teamcute.bang.Service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService pserv;
	PaymentEntity pe;
	
	//Create New Payment
	@PostMapping("/newPayment")
	public PaymentEntity newPayment(@RequestBody PaymentEntity payment){
		return pserv.newPayment(payment);
	}
	
	//Read All Payment Records
	@GetMapping("/getAllPayments")
	public List<PaymentEntity> getPayments(){
		return pserv.getPayments();
	}
	
	//Read Payment by paymentID
	@GetMapping("/getPayment")
	public PaymentEntity findByPaymentID(int paymentID) {
		if(pserv.findByPaymentID(paymentID) != null) {
			return pserv.findByPaymentID(paymentID);
		}else {
			return null;
		}
	}
	
	
	//Update Payment
	@PutMapping("/updatePayment")
	public PaymentEntity updatePayment(@RequestParam int paymentID, @RequestBody PaymentEntity newPaymentDetails) throws Exception{
		return pserv.updatePayment(paymentID, newPaymentDetails);
	}
	
	//DeletePayment
	@DeleteMapping("/deletePayment/{paymentID}")
	public String deletePayment(@PathVariable int paymentID) {
		return pserv.deletePayment(paymentID);
	}

}
