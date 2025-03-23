package com.backend.backend_springboot.controller;

import com.backend.backend_springboot.entity.Employe;
import com.backend.backend_springboot.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class TestController {



    @Autowired
    private EmployeService employeService;

    @GetMapping("/health")
    public String helth(){

        return "application up";
    }


    @PostMapping("/create-employe")

    public Employe createEmploye( @RequestBody Employe employe){

        return employeService.saveEmploye(employe);
    }







}
