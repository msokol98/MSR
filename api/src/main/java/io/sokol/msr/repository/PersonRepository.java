package io.sokol.msr.repository;

import io.sokol.msr.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByUserName(String userName);
}
