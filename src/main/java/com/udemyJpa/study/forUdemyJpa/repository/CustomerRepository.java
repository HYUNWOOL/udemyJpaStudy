package com.udemyJpa.study.forUdemyJpa.repository;

import com.udemyJpa.study.forUdemyJpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
