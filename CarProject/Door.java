public class Door extends Part
{
private String model;
private String colour;

public Door(String partNumber,String model,String colour)
{
super.partNumber = partNumber;
this.model = model;
this.colour = colour;

}
public String getModel()
{
return model;
}
public void setModel(String model)
{
this.model = model;
}	
public String getColour()
{
return colour;

}
public void setColour(String colour)
{
this.colour = colour;
}	
public String toString()
{
	
return super.toString "Partnumber:" + partNumber +"\t" + "Model:" + model +"\t"+  "Colour:" + colour;	
}












}	