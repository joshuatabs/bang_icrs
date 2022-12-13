package com.teamcute.bang.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teamcute.bang.Entity.PaymentEntity;
import com.teamcute.bang.Repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository pr;
	
	//Create or Insert new Payment
	public PaymentEntity newPayment(PaymentEntity payment){
		return pr.save(payment);
	}
	
	//Read All Payment Records
	public List<PaymentEntity> getPayments(){
		return pr.findAll();
	}
	
	//Read Payment by paymentID
	public PaymentEntity findByPaymentID(int paymentid) {
		if(pr.findBypaymentid(paymentid) != null) {
			return pr.findBypaymentid(paymentid);
		}else {
			return null;
		}
	}
	
	//Update Payment
	public PaymentEntity updatePayment(int paymentID, PaymentEntity newPaymentDetails) throws Exception{
		PaymentEntity payment = new PaymentEntity(); //Instance of payment
		
		try {
			
			//Search by ID
			payment = pr.findById(paymentID).get();
		
			//Update Record
			payment.setType(newPaymentDetails.getType());
			
			
			//Save
			return pr.save(payment);
			
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number "+ paymentID + " does not exist!");
		}
	}
	
	//Delete Payment
	public String deletePayment(int paymentID) {
		
		String msg;
		
		if(pr.findBypaymentid(paymentID) != null) {
			
			pr.deleteById(paymentID); //Find by paymentID
			msg = "Payment with ID Number "+paymentID+ "has been successfully deleted!";
			
		}else {
			msg = "Payment with ID Number "+paymentID+ "cannot be found!";
		}
		
		return msg;
	}

}
