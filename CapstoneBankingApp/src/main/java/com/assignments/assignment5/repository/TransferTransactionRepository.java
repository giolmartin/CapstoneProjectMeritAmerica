package com.assignments.assignment5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment5.models.TransferTransaction;

public interface TransferTransactionRepository extends JpaRepository<TransferTransaction, Integer>{

}