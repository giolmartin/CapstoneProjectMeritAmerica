package com.assignments.assignment5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment5.models.DepositTransaction;

public interface DepositTransactionRepository extends JpaRepository<DepositTransaction, Integer>{

}