package com.backend.backend_springboot.EmployeRepo;


import com.backend.backend_springboot.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepo extends JpaRepository<Employe,Long> {



}
