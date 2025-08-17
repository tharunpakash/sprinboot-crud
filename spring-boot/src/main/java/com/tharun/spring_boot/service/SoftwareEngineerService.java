package com.tharun.spring_boot.service;

import com.tharun.spring_boot.SoftwareRepo.SoftwareEngineerRepo;
import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class SoftwareEngineerService {
    @Autowired
    SoftwareEngineerRepo repo;
SoftwareEngineer engineer;
//    List<SoftwareEngineer>list= new ArrayList<>(Arrays.asList
//            (       new SoftwareEngineer(1,"tharun","java"),
//                    new SoftwareEngineer(2,"varun","dbms"),
//                    new SoftwareEngineer(3,"arun","python")
//));
    public List<SoftwareEngineer> getEngineer(){
        return repo.findAll();
    }


    public SoftwareEngineer getEngineerById(int id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//
//                return list.get(i);
//            }
////                }

        return repo.findById(id).orElse(new SoftwareEngineer());
    }
    public void addSoftwareEngineer(SoftwareEngineer addEngineer){
      repo.save(addEngineer);
    }


    public void updateEngineer(SoftwareEngineer updateEngineer) {
//        int index=0;
//        for (int i=0;i<list.size();i++){
//            if(list.get(i).getId()==updateEngineer.getId()){
//                index=i;
//                break;
//            }
//        }
//        list.set(index,updateEngineer);
        repo.save(updateEngineer);
    }

    public void deleteEngineer(SoftwareEngineer engineer) {
     repo.delete(engineer);
    }
    }



