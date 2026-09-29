package org.example.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="vehicals")
public class Vehical {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String vehicalName;
    private String type;
    private String year;
    private String numberPlate;
    private String model;
}
