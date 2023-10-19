package com.divisosoft.car;
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
      System.out.println("~~~~~~~~~~~~~~CAR DETAILS~~~~~~~~~~~~~~~~");

   Car car=new Car("polo \n",12); //Parameter Constructor

/*System.out.print("Enter the car name:-");
String a =sc.nextLine();
car.setname(a);
System.out.print("Enter the car modelNumber");
int b=Integer.parseInt(sc.nextLine());
car.setmodelNumber(b);*/


//System.out.println(car.getname());
//System.out.println(car.getmodelNumber());

			boolean check=true;
				while(check)
				{
			
			System.out.println("~~~~~~~~~~~~~~DOOR DETAILS~~~~~~~~~~~~~~~~");
			for(int i=0;i<4;i++)  		
			{    		
                   		//if(i<=3)
					Part[] door=new Door[4];
					door[i] =new Door(); 
					System.out.println("Enter the DoorLife");  
					String k= sc.nextLine();         //door[0].setdoorLife("no life need");
					((Door)door[i]).setdoorLife(k+i);            //door[1].setdoorLife("o life need");
					                           //door[2].setdoorLife("life need");
					                           //door[3].setdoorLife("ife need");
									
					//car.getpart()[i]=new Door();
					System.out.println("Enter the Door name"+i);
					String c =sc.nextLine();
					((Door)door[i]).setname(c+i);
					// car.getpart()[i].getname();
					System.out.println("Enter the Door Colour"+i);
					String d =sc.nextLine();
					((Door)door[i]).setcolour(d+i);
					// car.getpart()[i].getcolour();
					System.out.println("Enter the Door number"+i);
					int e =Integer.parseInt(sc.nextLine());
					((Door)door[i]).setnumber(e+i);
					// car.getpart()[i].getnumber(); 
						 
					
					
	  
	  
					//System.out.println(car.getpart()[i].getname());
					//System.out.println(car.getpart()[i].getcolour());
					// System.out.println(car.getpart()[i].getnumber());
	
		System.out.println("Do you want to continue enter yes");
					String m=sc.nextLine();
	
					if(m.equals("yes"))
					{
						check=true;
					}
				    else
				   {
					check =false;
					break;
				   }				
		}								
    }	
//else
     System.out.println("~~~~~~~~~~~~~~TYRE DETAILS~~~~~~~~~~~~~~~~");
for(int j=4,i=0;j<8;j++,i++)
{
	car.getpart()[j]=new Tyre();
	System.out.println("Enter the Tyre name"+j);
	String f = sc.nextLine();
    car.getpart()[j].setname(f+j);
    //car.getpart()[i].getname();
    
   System.out.println("Enter the Tyre colour"+j);
   String g = sc.nextLine();
   car.getpart()[j].setcolour(g+j);
   //car.getpart()[i].getcolour();
  
   System.out.println("Enter the Tyre number"+j);
   int h = Integer.parseInt(sc.nextLine());
   car.getpart()[j].setnumber(h+j);
   //car.getpart()[i].getnumber();
   
   //System.out.println(car.getpart()[i].getname());
   //System.out.println(car.getpart()[i].getcolour());
   //System.out.println(car.getpart()[i].getnumber());



				
			}
    System.out.println("~~~~~~~~~~~~~~STEERING DETAILS~~~~~~~~~~~~~~~~");
	
  car.getpart()[8]= new Steering();
  System.out.println("Enter the Steering name");
  String i = sc.nextLine();
  //car.getpart()[9].setname(i);

  System.out.println("Enter the  Steering  colour");
  String j = sc.nextLine();
  //car.getpart()[9].setcolour(j);

  System.out.println("Enter the  Steering  number");
  int k =Integer.parseInt(sc.nextLine());
  //car.getpart()[9].setnumber(k);

 //System.out.println(car.getpart()[9].getname());
  //System.out.println(car.getpart()[9].getcolour());
 // System.out.println(car.getpart()[9].getnumber());
 
  System.out.println(car); //toString 
  
}
}
