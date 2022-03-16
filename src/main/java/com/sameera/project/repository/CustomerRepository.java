package com.sameera.project.repository;

import com.sameera.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This Class represents Customer Repository.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
