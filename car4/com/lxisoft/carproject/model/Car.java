package com.lxisoft.carproject.model;

import java.util.Arrays;
import java.util.Objects;

public class Car  {
	
	private String carName;
	private String varient;
	private String colour;
	private String registrationNumber;
	
	
public String getCarName(){
return carName;
}
public void setCarName(String carName){
	this.carName = carName;
}

public String getVarient(){
	return varient;
}
public void setVarient(String varient){
	this.varient = varient;
}

public String getColour(){
	return colour;
}
public void setColour(String colour){
	this.colour = colour;
}

public String getRegistrationNumber() {return registrationNumber;}
	public void setRegistrationNumber(String registrationNumber) {this.registrationNumber = registrationNumber;}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Car car)) return false;
		return Objects.equals(getCarName(), car.getCarName()) && Objects.equals(getVarient(), car.getVarient()) && Objects.equals(getColour(), car.getColour()) && Objects.equals(getRegistrationNumber(), car.getRegistrationNumber());
	}



	@Override
	public String toString() {
		return "Car{" +
				"carName='" + carName + '\'' +
				", varient='" + varient + '\'' +
				", colour='" + colour + '\'' +
				", registrationNumber='" + registrationNumber + '\'' +
				'}';
	}
}
