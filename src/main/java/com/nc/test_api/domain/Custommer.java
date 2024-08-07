package com.nc.test_api.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // jpa entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Custommer {

    @Id
    @SequenceGenerator(name = "custommer_generator", sequenceName = "custommer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_squence")
    private Long Id;

    private String name;
    private String mail;
    private String password;
    private Integer age;
    private LocalDate dob;

}
