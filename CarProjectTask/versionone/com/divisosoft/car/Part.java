package com.divisosoft.car;
public class Part
{
 private int model_No;

    public void setModelNo(int model_No) 
	{
        this.model_No = model_No;
    }

    public int getModelNo() 
	{
        return model_No;
    }
	public String toString()
	{
	return ""+model_No;
	}
}