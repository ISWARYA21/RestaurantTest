package com.testapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Bill;

public interface IBillRepository extends JpaRepository<Bill,Integer> {

}
