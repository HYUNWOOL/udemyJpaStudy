package com.udemyJpa.study.forUdemyJpa.repository;

import com.udemyJpa.study.forUdemyJpa.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {



}
