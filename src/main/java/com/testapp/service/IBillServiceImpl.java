package com.testapp.service;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sprintaws.dao.IBillRepository;
import com.sprintaws.entity.Bill;


@Service
public class IBillServiceImpl implements IBillService {
  @Autowired
  private IBillRepository dao;
  
  
	@Override
	public Bill addBill(Bill bill) {
		return dao.save(bill);
		
	}
	@Override
	public Bill updateBill(Bill bill) {
		Bill bill1 = dao.findById(bill.getBillId()).orElseThrow(
				() -> new EntityNotFoundException("no Bill found by id"));
				    bill1.setBillDate(bill.getBillDate());
					bill1.setOrder(bill.getOrder());
					bill1.setTotalItem(bill.getTotalItem());
					bill1.setTotalCost(bill.getTotalCost());
					return dao.save(bill);
	}
	
	
	@Override
	public Bill viewBill(int billid) {
		Bill bill = dao.findById(billid).orElseThrow(
				()-> new EntityNotFoundException("No bill found by the id"));
		return bill;
	}
	

	@Override
	public List<Bill> viewBillsById(String custId) {
				return (List<Bill>)dao.findAll();
	}

	@Override
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		return null;
	}

	
	@Override
	public void removeBill(int billid) {
		Bill bill1 = dao.findById(billid).orElseThrow(
				()-> new EntityNotFoundException("No bills found "));
		dao.delete(bill1);
	}
	
	@Override
	public List<Bill> viewAllBill() {
		return (List<Bill>) dao.findAll();
	}
	
}