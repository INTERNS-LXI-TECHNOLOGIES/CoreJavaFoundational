package com.lxisoft.hospitalproject.model;
import java.util.*;

public class Hospital {

    private String hospitalName;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public Hospital(){
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hospital other = (Hospital) obj;
        if (hospitalName == null) {
            if (other.hospitalName != null)
                return false;
        } else if (!hospitalName.equals(other.hospitalName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Hospital [hospitalName=" + hospitalName + "]";
    }

    
}