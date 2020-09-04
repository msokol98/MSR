package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class ServiceRequest {

    public enum Status {UNASSIGNED, IN_THE_WORKS, READY_FOR_PICKUP, ARCHIVED};

    @Id
    @GeneratedValue
    private long id;

    @Column(columnDefinition="TEXT")
    private String description;

    private Status status = Status.UNASSIGNED;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Employee employee;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
