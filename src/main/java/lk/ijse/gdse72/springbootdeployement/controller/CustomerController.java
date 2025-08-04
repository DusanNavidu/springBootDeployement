package lk.ijse.gdse72.springbootdeployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @GetMapping
    public String getAllCustomers() {
        return "List of all customers";
    }
}
