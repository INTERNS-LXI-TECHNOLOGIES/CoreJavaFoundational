package com.diviso.hackathon.model;

import java.util.Objects;

public class Patient {

    private String name;
    private String age;
    private String patientProblem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPatientProblem() {
        return patientProblem;
    }

    public void setPatientProblem(String patientProblem) {
        this.patientProblem = patientProblem;
    }

    
   
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

       
        Patient other = (Patient) obj;

       
        return Objects.equals(this.name, other.name) ;
                
               
    }

    @Override
    public String toString() {
        return " name=" + name + ", age=" + age + ", patientProblem=" + patientProblem ;
    }
}
