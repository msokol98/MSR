package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue
    private long id;

    private String make;
    private String model;
    private int year;
    private String color;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "vehicle")
    private List<ServiceRequest> serviceRequests = new ArrayList<>();

    public void addServiceRequest(ServiceRequest sr) {
        serviceRequests.add(sr);
    }

    public void removeServiceRequest(ServiceRequest sr) {
        serviceRequests.remove(sr);
    }
}
