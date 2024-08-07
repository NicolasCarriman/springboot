package com.nc.test_api.domain;

import java.time.LocalDate;

import javax.persistence.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity // jpa entity
@NoArgsConstructor
@Table
public class Custommer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custommer_generator")
    @SequenceGenerator(name = "custommer_generator", sequenceName = "custommer_sequence", allocationSize = 1)
    /**
     * PERFORMANCE CONFIG
     * estas anotaciones generan las primary key automaticamente
     * con generated value asignas una estrategia de generacion de primary key luego
     * asignas el generador
     * en este caso seria sequencGenerator
     * all location size sequencia en entero precargada de la base de datos de
     * sequencias
     * 
     */
    private Long Id;

    private String name;
    private String mail;
    private String password;
    private LocalDate dob;
    @Transient // omite esta variable de la persistencia
    private Integer age;

    public Custommer(Long id, String name, String mail, String password, LocalDate dob) {
        Id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.dob = dob;
    }
}
