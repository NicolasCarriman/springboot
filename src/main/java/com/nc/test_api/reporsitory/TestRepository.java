package com.nc.test_api.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.nc.test_api.domain.TestEntity;

@NoRepositoryBean
public interface TestRepository extends JpaRepository<TestEntity, String> {
    
}