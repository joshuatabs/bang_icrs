package com.teamcute.bang.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamcute.bang.Entity.ReservationEntity;




public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {
	
	ReservationEntity findByRoomId(String roomid);

}

