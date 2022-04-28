package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.BloodStock;
import com.app.service.IBloodStockService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/stock")
public class BloodStockController {
	
//	@Autowired
//	private IBloodStockService stockService;
//	
//	@GetMapping("/{email}")
//	public BloodStock getBloodStockByEmail(@PathVariable String email) {
//		System.out.println(" "+email);
//		
//		return stockService.getBloodStockByEmail(email);
//	}
}
