package com.diviso.hackathon.model;

import java.util.Objects;

public class Model {

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

       
        Model other = (Model) obj;

       
        return Objects.equals(this.name, other.name) &&
                Objects.equals(this.age, other.age) &&
                Objects.equals(this.patientProblem, other.patientProblem);
    }


    @Override
    public String toString() {
       
        return super.toString();
    }



}