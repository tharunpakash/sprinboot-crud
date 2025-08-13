package com.tharun.spring_boot.controller;

import com.tharun.spring_boot.service.SoftwareEngineerService;
import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SoftwareEngineerController {
    @Autowired
    SoftwareEngineerService service;
    @GetMapping("/getengineer")
public List<SoftwareEngineer>getEngineer(){
    return service.getEngineer();
}
}
