package lk.ijse.gdse72.springbootdeployement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dusan
 * @date 8/4/2025
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    private Long id;
    private String name;
    private String address;
    private String contactNumber;
}
