package com.sameera.project.repository;

import com.sameera.project.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class represents Order Repository.
 */
public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
