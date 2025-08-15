package com.tharun.spring_boot.service;

import com.tharun.spring_boot.SoftwareRepo.SoftwareEngineerRepo;
import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SoftwareEngineerService {
    @Autowired
    SoftwareEngineerRepo repo;
SoftwareEngineer engineer;
    List<SoftwareEngineer>list= Arrays.asList
            (       new SoftwareEngineer(1,"tharun",Arrays.asList("mongodb","sql","jdbc")),
                    new SoftwareEngineer(2,"varun",Arrays.asList("java","mysql","dbms")),
                    new SoftwareEngineer(3,"arun",Arrays.asList("hmtl","css","javascript")));

    public List<SoftwareEngineer> getEngineer(){
        return list;
    }

    public SoftwareEngineer getEngineerById(int id) {
//        for(int i=1;i<list.size();i++){
//            if(list.get(i).getId() == id){
//                return list.get(i);
//            }
        return list.stream().filter(s->s.getId()==id)
        .findFirst().get();
        }
    }

