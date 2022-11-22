package com.teamcute.bang.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamcute.bang.Entity.FoodEntity;




@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer> {

	//user-defined query
    FoodEntity findByName(String name);
}
