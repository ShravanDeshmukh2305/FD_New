package com.example.FD.Aggregator.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "ref_id", unique = true, nullable = false)
    private String refNo;

    private String mobile;
    private String email;
    private String firstName;
    private String lastName;
    private String preferredLang; // Preferred Language

    @Column(name = "date_of_birth")
    private LocalDate dob;

    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @PrePersist
    protected void onCreate() {
        createdDate = LocalDateTime.now();
        updatedDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedDate = LocalDateTime.now();
    }
}
