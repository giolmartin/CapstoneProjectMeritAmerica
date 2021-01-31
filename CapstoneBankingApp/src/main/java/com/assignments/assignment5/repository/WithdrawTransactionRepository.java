package com.assignments.assignment5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment5.models.WithdrawTransaction;

public interface WithdrawTransactionRepository extends JpaRepository<WithdrawTransaction, Integer>{

}