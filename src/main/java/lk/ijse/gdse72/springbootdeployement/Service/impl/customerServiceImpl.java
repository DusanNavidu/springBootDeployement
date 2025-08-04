package lk.ijse.gdse72.springbootdeployement.Service.impl;

import lk.ijse.gdse72.springbootdeployement.Repository.CustomerRepository;
import lk.ijse.gdse72.springbootdeployement.Service.customerService;
import lk.ijse.gdse72.springbootdeployement.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@Service
@RequiredArgsConstructor
public class customerServiceImpl implements customerService {
    private final CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
