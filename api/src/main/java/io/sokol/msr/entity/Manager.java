package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Manager extends Worker {

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;

}
