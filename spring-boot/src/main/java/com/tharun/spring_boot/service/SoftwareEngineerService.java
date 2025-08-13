package com.tharun.spring_boot.service;

import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SoftwareEngineerService {
    public List<SoftwareEngineer> getEngineer(){
        List<SoftwareEngineer>list= Arrays.asList
                (new SoftwareEngineer(1,"tharun",Arrays.asList("mongodb","sql","jdbc")),
                 new SoftwareEngineer(2,"varun",Arrays.asList("java","mysql","dbms")),
                 new SoftwareEngineer(3,"arun",Arrays.asList("hmtl","css","javascript")));
        return list;
    }
}
