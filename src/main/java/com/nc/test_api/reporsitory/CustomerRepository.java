package com.nc.test_api.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nc.test_api.domain.Custommer;

@Repository
public interface CustomerRepository extends JpaRepository<Custommer, Long> {}