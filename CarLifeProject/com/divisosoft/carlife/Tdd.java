package com.divisosoft.carlife;
import java.util.Scanner;
public class Tdd{
static Scanner scan = new Scanner(System.in);
	public static void main (String[] args){
		Car car = new Car();
		car.setdoor(new Door());
		car.settyre(new Tyre());
		car.setstr(new Steering());
		System.out.print("enter door life :");
		((Door)car.getdoor()).setDlife(scan.nextInt());
		double dlife = ((Door)car.getdoor()).getDlife();
		System.out.print("enter tyre life :");
		((Tyre)car.gettyre()).setTlife(scan.nextInt());
		double tlife = ((Tyre)car.gettyre()).getTlife();
		System.out.print("enter steering life :");
		((Steering)car.getstr()).setSlife(scan.nextInt());
		double slife = ((Steering)car.getstr()).getSlife();
		boolean flag = true;
		while(flag){
			if(car.getdoor() instanceof Door && car.gettyre()instanceof Tyre && car.getstr() instanceof Steering){			
				System.out.println("enter the km coverd by the car");
				double dis = scan.nextDouble();
				dlife=dlife-(dis/10)*2.5;	
				tlife=tlife-(dis/10)*10.5;
				slife=slife-(dis/10)*15.5;
				System.out.println("door life is "+dlife+"\n tyre life is "+tlife+" \n steering liofe is "+slife);		
				}
					System.out.println("press any number to continue or 0 to exit ?");
					int doyou = scan.nextInt();
						if(doyou==0){
						flag=false;
						}
		}
	}
}