package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="customers")
public class Customer {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     private String name;
     private String password;
     private String phoneNumber;
     private String nicNumber;
     private String address;
}
