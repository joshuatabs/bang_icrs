package com.bang.art.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bang.art.Entity.RoomEntity;

@Repository
public interface RoomRepository extends JpaRepository<RoomEntity, Integer>{
	RoomEntity findByCode(String code);
}
