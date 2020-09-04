package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"serviceRequests", "manager"})
public class Employee extends Worker {

    @ManyToOne
    private Manager manager;

    @OneToMany(mappedBy = "employee")
    private List<ServiceRequest> serviceRequests = new ArrayList<>();

}
