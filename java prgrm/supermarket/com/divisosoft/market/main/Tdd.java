package com.divisosoft.market;
public class Tdd{
public static void main(String args[]){	
	
	Supermarket market=new Supermarket();
	market.setName("ROYAL BAZAR");
    market.setOwnerName("Akash Varma");
	market.setLocation("Thrissur");
	market.setColor("white");
	
	String staffname[]={"Adhyan","Laksh","Kripu","Aju"};
	int staffage[]={18,34,26,21};
	String staffaddress[]={"palakkad","Thrissure","ottapalam","pattambi"};
	for(int i=0;p=0;i<4;i++){
		market.staff[i]=new male();
		market.staff[i].setName(staffname[p]);
		market.staff[i].setAge(staffage[p]);
		market.staff[i].setAddress(staffaddress[p]);
		p++
	}
	
	String staffname[]={"Surya","Priya","Thanu","Mallu"};
	int staffage[]={19,30,23,37};
	String staffaddress[]={"Mannanur","Lakkidi","Shornur","Nellaya"};
	for(int i=4;p=0;i<8;i++){
		male.staff[i]=new Staff();
		market.staff[i].setName(staffname[p]);
		market.staff[i].setAge(staffage[p]);
		market.staff[i].setAddress(staffaddress[p]);
		p++
	}
	
	

	
	System.out.println(market);
	
	
}
	
}