package com.diviso.scannerpollution.model;

public class Car
{

private String name;
private String regNo;


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getRegNo() {
    return regNo;
}
public void setRegNo(String regNo) {
    this.regNo = regNo;
}

@Override
public String toString() {
    return "Car [name=" + name + ", regNo=" + regNo + "]";
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
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (regNo == null) {
        if (other.regNo != null)
            return false;
    } else if (!regNo.equals(other.regNo))
        return false;
    return true;
}


}