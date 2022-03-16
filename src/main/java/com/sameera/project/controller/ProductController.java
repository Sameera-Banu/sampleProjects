package com.sameera.project.controller;

import com.sameera.project.model.Product;
import com.sameera.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Product Class.
 */
@RestController
@RequestMapping("/product")
public class ProductController {


        @Autowired
        private ProductRepository productRepository;

    /**
     * Method that is used to create product.
     *
     * @param product product
     * @return created product
     */
    @PostMapping
        public ResponseEntity<Product> createProduct(@RequestBody Product product) {
            try {
                Product product1 = productRepository.save(product);
                return new ResponseEntity<>(product1, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }
