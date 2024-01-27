package model;

import java.util.Objects;

public class Patient {
    
    private String patientName;
    private int patientAge;
    private String ailment;
    
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public String getAilment() {
        return ailment;
    }
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
        result = prime * result + patientAge;
        result = prime * result + ((ailment == null) ? 0 : ailment.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Patient other = (Patient) obj;

    
    return Objects.equals(patientName, other.patientName);
}


    @Override
    public String toString() {
        return "Patient patientName=" + patientName + ", patientAge=" + patientAge + ", ailment=" + ailment + "]";
    }


    
}
