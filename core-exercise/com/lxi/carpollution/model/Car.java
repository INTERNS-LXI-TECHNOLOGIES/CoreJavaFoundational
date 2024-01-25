package com.lxi.carpollution.model;
public class Car 
{
    private String branName;
    private String ownerName;
    private String regNumber;
    
   public String getBranName() {
        return branName;
    }
    public void setBranName(String branName) {
        this.branName = branName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((branName == null) ? 0 : branName.hashCode());
        result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
        result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (regNumber == null) {
            if (other.regNumber != null)
                return false;
        } else if (!regNumber.equals(other.regNumber))
            return false;
        return true;
    }

    
    @Override
    public String toString() 
    {
        return "Car branName=" + branName + " ownerName=" + ownerName + " regNumber=" + regNumber ;
    }

    public void drive()
    {
        System.out.println("im driveing a lorry");
    }
    
}