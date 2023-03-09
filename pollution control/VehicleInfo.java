import java.util.*;
import java.text.*;
public class VehicleInfo{

    private String centreName;
	private String date;
	
	
	public String getCentreName()
	{
		return centreName;
	}
	
	public void setCentreName(String centreName)
	{
		this.centreName = centreName;
	}
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}



public String toString(){
	
	return "      Center Name :" + centreName+"\n" + "      Updated Date : " + date + "\n";
	
}

}