package io.sokol.msr.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Worker extends Person {

    public enum Seniority {ENTRY, JUNIOR, MIDDLE, SENIOR};

    @CreationTimestamp
    private LocalDateTime hireDate;

    @Column(length = 9)
    private String ssn;

    private String title;
    private Seniority seniority;

}
