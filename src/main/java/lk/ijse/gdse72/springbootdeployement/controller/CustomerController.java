package lk.ijse.gdse72.springbootdeployement.controller;

import jakarta.validation.Valid;
import lk.ijse.gdse72.springbootdeployement.Service.customerService;
import lk.ijse.gdse72.springbootdeployement.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final customerService service;

    @GetMapping("getCustomer")
    public String getCustomer() {
        return "customer1";
    }


    @PostMapping("register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody @Valid Customer Customer) {
        return ResponseEntity.ok(service.saveCustomer(Customer));
    }
}
