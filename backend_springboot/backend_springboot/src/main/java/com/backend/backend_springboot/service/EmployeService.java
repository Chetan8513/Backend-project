package com.backend.backend_springboot.service;


import com.backend.backend_springboot.EmployeRepo.EmployeRepo;
import com.backend.backend_springboot.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {


    @Autowired
    private EmployeRepo employeRepo;

    public Employe saveEmploye(Employe employe) {

        return employeRepo.save(employe);


    }
}
