package com.testapp.service;
import java.time.LocalDate;
import java.util.List;

import com.sprintaws.entity.Bill;

public interface IBillService {
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill viewBill(int billid);
	public List<Bill> viewBillsById(String custId);
	public List<Bill> viewBills(LocalDate startDate,LocalDate endDate);
    public void removeBill(int billid);
    public List<Bill> viewAllBill();
   // public double TotalCost(Bill bill);
}