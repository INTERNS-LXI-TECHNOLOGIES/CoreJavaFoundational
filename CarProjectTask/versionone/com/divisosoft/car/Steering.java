package com.divisosoft.car;
public class Steering extends Part
{
	private String designerName;

	public void setDesignerName(String designerName)
	{
		this.designerName = designerName;
	}

	public String getDesignerName()
	{
		return designerName;

	}
	
	public String toString()
	{
		System.out.println("\t Steering Details ");
		String toString = "designerName is:"+designerName+"\n Steering model_No is :"+super.toString()+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		return toString;
	}
}