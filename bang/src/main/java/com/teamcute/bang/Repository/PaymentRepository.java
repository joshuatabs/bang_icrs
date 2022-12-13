package com.ruiz.bang.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruiz.bang.Entity.PaymentEntity;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
	
	PaymentEntity findBypaymentid(int paymentid);
		
}
