package com.tharun.spring_boot.softwareEngineer;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {
    private Integer id;
    private String name;
    private List<String> techstack;

    public SoftwareEngineer(){
    }

    public SoftwareEngineer(Integer id, String name, List<String> techstack) {
        this.id = id;
        this.name = name;
        this.techstack = techstack;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTechstack() {
        return techstack;
    }

    public void setTechstack(List<String> techstack) {
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
