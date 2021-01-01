package com.udemyJpa.study.forUdemyJpa.repository;

import com.udemyJpa.study.forUdemyJpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
