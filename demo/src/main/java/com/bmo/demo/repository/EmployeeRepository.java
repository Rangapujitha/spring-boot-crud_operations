package com.bmo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bmo.demo.model.EmployeeEntity;
 
@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {
 
}
