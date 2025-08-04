package lk.ijse.gdse72.springbootdeployement.controller;

import lk.ijse.gdse72.springbootdeployement.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @GetMapping("/all")
    public String getAllCustomers() {
        return "List of all customers";
    }

    @PostMapping("/create")
    public Customer createCustomer(Customer customer) {
        return customer;
    }
}
