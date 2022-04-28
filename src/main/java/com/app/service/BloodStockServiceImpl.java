package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.BloodStockRepository;
import com.app.pojos.BloodStock;

@Service
@Transactional
public class BloodStockServiceImpl implements IBloodStockService {
	
	@Autowired
	private BloodStockRepository stockRepo;

	@Override
	public BloodStock getBloodStockByEmail(String email) {
		// TODO Auto-generated method stub
		return stockRepo.getBloodStockByEmail(email);
	}

	
	
}
