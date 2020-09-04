package io.sokol.msr.repository;

import io.sokol.msr.entity.Customer;
import io.sokol.msr.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
