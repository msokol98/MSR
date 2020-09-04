package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer extends Person {

    @OneToMany(mappedBy = "customer")
    private List<Vehicle> vehicles = new ArrayList<>();

    @OneToMany(mappedBy = "customer")
    private List<ServiceRequest> serviceRequests = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    public void addServiceRequest(ServiceRequest sr) {
        serviceRequests.add(sr);
    }

    public void removeServiceRequest(ServiceRequest sr) {
        serviceRequests.remove(sr);
    }

}
