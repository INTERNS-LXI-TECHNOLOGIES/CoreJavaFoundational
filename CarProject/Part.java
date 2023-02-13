public class Part
{
private long partNumber;

public Part(long partNumber)
{
this.partNumber = partNumber;
}


public long getPartNumber()
{
return partNumber;
}
public void setPartNumber(long partNumber)
{
this.partNumber = partNumber;	
}
public String toString()
{
return  "Part Number:" + partNumber;
}
}