package com.nc.test_api.domain;

import lombok.Data;
import lombok.AllArgsContructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Entity;

@Data
@AllArgsContructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = 'customers')
public class TestEntity {
  
  @Id
  private String name;

  private String mail;

  private String password;


}
