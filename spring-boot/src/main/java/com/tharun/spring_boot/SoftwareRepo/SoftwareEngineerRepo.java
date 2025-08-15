package com.tharun.spring_boot.SoftwareRepo;

import com.tharun.spring_boot.softwareEngineer.SoftwareEngineer;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepo extends JpaRepository<SoftwareEngineer,Integer> {

}
