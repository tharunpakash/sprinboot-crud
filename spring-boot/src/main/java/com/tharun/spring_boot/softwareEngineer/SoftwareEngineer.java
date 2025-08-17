package com.tharun.spring_boot.softwareEngineer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
@Entity
public class SoftwareEngineer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String techstack;

    public SoftwareEngineer(){
    }

    public SoftwareEngineer(int id, String name, String techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechstack() {
        return techstack;
    }

    public void setTechstack(String techstack) {
        this.techstack = techstack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name)
                && Objects.equals(techstack, that.techstack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techstack);
    }
}
