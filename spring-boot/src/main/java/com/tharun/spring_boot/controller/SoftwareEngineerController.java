package com.tharun.spring_boot.controller;

import com.tharun.spring_boot.service.SoftwareEngineerService;
import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SoftwareEngineerController {
    @Autowired
    SoftwareEngineerService service;
    @GetMapping("/getengineer")
public List<SoftwareEngineer>getEngineer(){
    return service.getEngineer();
}
    @GetMapping("/getengineer/{id}")
    public SoftwareEngineer getSoftwareEngineer( @PathVariable int id){
return service.getEngineerById(id);
    }

    @PostMapping("/addengineer")
    public void add(@RequestBody SoftwareEngineer addEngineer){
        service.addSoftwareEngineer(addEngineer);
    }
    @PutMapping("/updateengineer")
    public void updateEngineer(@RequestBody SoftwareEngineer updateEngineer){
         service.updateEngineer(updateEngineer);
    }
    @DeleteMapping("/deleteengineer")
public void deleteEngineer(@RequestBody SoftwareEngineer Engineer){
        service.deleteEngineer(Engineer);
    }
}
