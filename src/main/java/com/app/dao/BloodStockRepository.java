package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.BloodStock;

public interface BloodStockRepository extends JpaRepository<BloodStock, Integer>{
	
	@Query(value="select  b from BloodStock b where b.email=:email")
	BloodStock getBloodStockByEmail(String email);

	

}
