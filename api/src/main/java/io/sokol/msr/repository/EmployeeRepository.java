package io.sokol.msr.repository;

import io.sokol.msr.entity.Employee;
import io.sokol.msr.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
