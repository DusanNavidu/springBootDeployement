package lk.ijse.gdse72.springbootdeployement.controller;

import jakarta.validation.Valid;
import lk.ijse.gdse72.springbootdeployement.entity.Customer;
import org.springframework.web.bind.annotation.*;

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
    public Customer createCustomer(@RequestBody @Valid Customer customer) {
        return customer;
    }
}
