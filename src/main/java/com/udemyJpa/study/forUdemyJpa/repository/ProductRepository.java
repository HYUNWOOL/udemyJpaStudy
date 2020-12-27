package com.udemyJpa.study.forUdemyJpa.repository;

import com.udemyJpa.study.forUdemyJpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
