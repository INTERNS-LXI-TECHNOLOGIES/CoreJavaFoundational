package com.diviso.hospitalproject.model;

public class HospitalModel {

    private String patientName;
    private String patientAddress;
    private String registerationNumber;
    private String patientDisease;

    
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getPatientAddress() {
        return patientAddress;
    }
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }
    public String getRegisterationNumber() {
        return registerationNumber;
    }
    public void setRegisterationNumber(String registerationNumber) {
        this.registerationNumber = registerationNumber;
    }
    public String getPatientDisease() {
        return patientDisease;
    }
    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
    
    public HospitalModel(String patientName, String patientAddress, String registerationNumber, String patientDisease) {
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.registerationNumber = registerationNumber;
        this.patientDisease = patientDisease;
    }

    
   
         
   

    
}
