
import java.util.*;
import java.text.*;

public class VehicleInfo
{
	
	
private Date date;
private String centerName;	
	
	
	
	
	public Date getDate()
    {
	  return date;
    }
    public void setDate(Date date)
        {
	      this.date=date;
		}
	
	
	public String getCenterName()
    {
	  return centerName;
    }
    public void setCenterName(String centerName)
        {
	      this.centerName=centerName;
		}
	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
	
	return         "\nDate:" + date+ "\n" 
				 + "Center Name:" + centerName + "\n";
	
	}
	
}