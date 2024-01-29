package com.lxisoft.hospitalproject.model;
import java.util.*;

public class Patient {
  private String patientName;
  private int age;
  private String sick;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }
public Patient(){
}
    public Patient(String patientName, int age, String sick) {
        this.patientName = patientName;
        this.age = age;
        this.sick = sick;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Patient)) return false;
        if (!super.equals(object)) return false;
        Patient patient = (Patient) object;
        return getAge() == patient.getAge() && java.util.Objects.equals(getPatientName(), patient.getPatientName()) && java.util.Objects.equals(getSick(), patient.getSick());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", age=" + age +
                ", sick='" + sick + '\'' +
                '}';
    }
}