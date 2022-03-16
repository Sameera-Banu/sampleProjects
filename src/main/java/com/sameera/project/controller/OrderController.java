package com.sameera.project.controller;

import com.sameera.project.model.CustomerOrder;
import com.sameera.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controller for Order class.
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderRepository orderRepository;

    /**
     * Method that is used to place order.
     *
     * @param order order object
     * @return created order object
     */
    @PostMapping
    public ResponseEntity<CustomerOrder> placeOrder(@RequestBody CustomerOrder order) {
        try {
            CustomerOrder order1 = orderRepository.save(order);
            return new ResponseEntity<>(order1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Method that is used to fetch all the orders.
     *
     * @return list of orders.
     */
    @GetMapping
    public ResponseEntity<List<CustomerOrder>> fetchAllOrders() {
        List<CustomerOrder> orders;
        try {
            orders = orderRepository.findAll();
           return  new   ResponseEntity<>(orders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    /**
     * Method that is used to update the order status.
     *
     * @param id id
     * @param status status to update
     * @return updated order object
     */
    @PatchMapping("/{id}/{status}")
    public ResponseEntity<CustomerOrder> updateStatus(@PathVariable("id") Long id, @PathVariable("status") CustomerOrder.Status status){
        try {
             CustomerOrder customerOrder = orderRepository.getById(id);
             customerOrder.setStatus(status);
             CustomerOrder customerOrder1 = orderRepository.save(customerOrder);
            return  new   ResponseEntity<>(customerOrder1, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
}
}
