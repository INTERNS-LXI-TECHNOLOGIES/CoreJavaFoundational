public class Item
{
	String itemName;
	int itemPrice,itemTotAmount=0;
	int itemQuantity,totalAvailable;
	public void setItem(String iName,int iPrice,int totalAva)
	{
		this.itemName=iName;
		this.itemPrice=iPrice;
		this.totalAvailable=totalAva;
	}
	public void setItemAmount()
	{
		this.itemTotAmount=(this.itemPrice * this.itemQuantity);
	}
	public int checkQuantity(int quantity)
	{
		int avail;
		avail=this.totalAvailable;
		this.totalAvailable=this.totalAvailable-quantity;
		if(this.totalAvailable<0)
		{
			System.out.println("Sorry only " + avail +" Left");
			this.totalAvailable=avail;
			return 0;
		}
		else
			return 1;
	}
	

}