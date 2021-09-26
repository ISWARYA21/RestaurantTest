package com.testapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.entity.Bill;
import com.testapp.service.IBillServiceImpl;
@RestController
public class BillController {
	@Autowired
		IBillServiceImpl BillService;
		
		@PostMapping("/bill")
		public void addBill(@RequestBody Bill bill) {	
			BillService.addBill(bill);
		}
		
		
		 
		  @GetMapping("/bill/{billid}") 
		  public Bill getCategorybyId(@PathVariable("billid")int billid) { 
			  return BillService.viewBill(billid);
		   }
		  
		  
		  @GetMapping("/bill")
		  public List<Bill> getAllBill(){ 
			  return BillService.viewAllBill();
		  }
		 
		  @DeleteMapping("/bill/{billid}") 
		  public void deleteBill(@PathVariable int billid) {
			  BillService.removeBill(billid);
		  }
		  
		  
		  @PutMapping("/bill") 
		  public Bill updateBill(@RequestBody Bill bill) {
			  return BillService.updateBill(bill); 
		  }
		 
	}