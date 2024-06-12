package sn.techKitchen.HRMapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEES")
@Data

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String first_name;
    private String last_name;
    private String mail;
    private String password;

}
