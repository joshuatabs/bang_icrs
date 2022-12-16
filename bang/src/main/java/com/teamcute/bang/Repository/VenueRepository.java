package com.teamcute.bang.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamcute.bang.Entity.VenueEntity;

@Repository
public interface VenueRepository extends JpaRepository<VenueEntity, Integer> {
	
	VenueEntity findByvenueid(int venueid);
	
}
