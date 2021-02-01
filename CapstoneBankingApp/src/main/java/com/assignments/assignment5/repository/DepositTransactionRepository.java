
package com.assignments.assignment5.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment5.models.AccountHolder;
import com.assignments.assignment5.models.CDOffering;
import com.assignments.assignment5.models.DepositTransaction;
import com.assignments.assignment5.models.Transaction;

public interface DepositTransactionRepository extends JpaRepository<DepositTransaction, Integer>{

	List<Transaction> findByLocation(String location);
	
}