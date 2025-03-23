package com.backend.backend_springboot.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "department_tbl")
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;

    @CreationTimestamp                 // this annotation automatically update the user eregister date
    private Timestamp createdAt;


    @UpdateTimestamp
    private Timestamp updatedAt;


    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<Employe> employeesl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Employe> getEmployeesl() {
        return employeesl;
    }

    public void setEmployeesl(List<Employe> employeesl) {
        this.employeesl = employeesl;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", employeesl=" + employeesl +
                '}';
    }
}
