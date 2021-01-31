package com.assignments.assignment5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.assignment5.models.CDAccount;
import com.assignments.assignment5.models.RolloverIRA;

public interface RolloverIRARepository extends JpaRepository<RolloverIRA, Integer>{

}
