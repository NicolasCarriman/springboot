package com.nc.test_api.reporsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.nc.test_api.domain.Custommer;

@Repository
public interface CustomerRepository extends JpaRepository<Custommer, Long> {

    @Query("SELECT c FROM Custommer c Where c.mail = ?1")
    Optional<Custommer> findCustommerByEmail(String email); 
}