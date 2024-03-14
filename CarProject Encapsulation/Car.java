public class Car
{
private String name;
private  String color;
private String brand;
private Door[] door=new  Door[4];
private Tyre[] tyre=new Tyre[4];
private Steering steering;

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}


public void setColor(String color)
{
this.color=color;
}
public String getColor()
{
return color;
}



public void setBrand(String brand)
{
this.brand=brand;
}
public String getBrand()
{
return brand;
}



public void setDoor(Door[] door)
{
this.door=door;
}
public Door[] getDoor()
{
return door;
}



public void setTyre(Tyre[] tyre)
{
this.tyre=tyre;
}
public Tyre[] getTyre()
{
return tyre;
}



public void setSteering(Steering steering)
{
	this.steering = steering;
}
public Steering getSteering()
{
	return steering;
}
}

