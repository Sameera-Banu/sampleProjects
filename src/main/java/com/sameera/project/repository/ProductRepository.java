package com.sameera.project.repository;

import com.sameera.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class represents Product repository.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
