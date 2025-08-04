package lk.ijse.gdse72.springbootdeployement.Repository;

import lk.ijse.gdse72.springbootdeployement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Additional query methods can be defined here if needed
}
