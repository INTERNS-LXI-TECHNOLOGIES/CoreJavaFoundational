package com.divisosoft.student;
public class ApplicationForm
 {
    private String name;
    private int age;
    private String gender;
    private long aadharNumber;
    private double tax;
    private boolean areYouMarried;

   
    // Getter and Setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean getAreYouMarried() {
        return areYouMarried;
    }

    public void setAreYouMarried(boolean areYouMarried) {
        this.areYouMarried = areYouMarried;
    }
	public String toString()
	{
		String toString = name+"\n"+age+"\n"+gender+"\n"+aadharNumber+"\n"+tax+"\n"+areYouMarried;
		return toString;
	}
}
