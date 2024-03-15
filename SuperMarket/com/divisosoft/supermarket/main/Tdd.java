package com.divisosoft.supermarket.main;
import com.divisosoft.supermarket.market.*;

public class Tdd{

public static void main(String []args){
	
	Supermarket supermarket = new Supermarket();
	//supermarket.name="Daymart Hypermarket";
    supermarket.setname("Daymart Supermarket");
	supermarket.getname();
	supermarket.setownername("Ibrahim Ali");
	supermarket.getownername();
	//System.out.println("Market name is\t:"+supermarket.getname());
	//System.out.println("owner name is\t:"+supermarket.getownername());
	
	supermarket.employ[0] = new Male();
	supermarket.employ[0].jobname="Salesman";
	//((Male)supermarket.employ[0]).salary=150000;
	//((Male)supermarket.employ[0]).maleemployname="Anil Kumar";
	((Male)supermarket.employ[0]).setSalary(23655);
	((Male)supermarket.employ[0]).getSalary();
	((Male)supermarket.employ[0]).setMalename("Anilkumar");
	((Male)supermarket.employ[0]).getMalename();
	((Male)supermarket.employ[0]).setAge(54);
	((Male)supermarket.employ[0]).getAge();



	
	System.out.println(((Male)supermarket.employ[0]).getSalary());
	
	supermarket.employ[1] = new Female();
	supermarket.employ[1].jobname="Salesgirl";
	//((Female)supermarket.employ[1]).salary=15000;
	//((Female)supermarket.employ[1]).femaleemployname="Kavitha";
	((Female)supermarket.employ[1]).setfemalesalary(15000);
	((Female)supermarket.employ[1]).getSalary();
	((Female)supermarket.employ[1]).setfemalename("Kavitha");
	((Female)supermarket.employ[1]).getfemalename();
	
    ((Female)supermarket.employ[1]).setAge(30);
	
	System.out.println("FEMALE EMPLOY AGE IS\t:"+((Female)supermarket.employ[1]).getAge());
	

	
	supermarket.employ[2] = new Male();
	supermarket.employ[2].jobname="Accountant";
	//((Male)supermarket.employ[2]).salary=36000;
	//((Male)supermarket.employ[2]).maleemployname="Ramakrishnan";
	((Male)supermarket.employ[2]).setSalary(22300);
	((Male)supermarket.employ[2]).getSalary();
	((Male)supermarket.employ[2]).setMalename("Ramakrishnan");
	((Male)supermarket.employ[2]).getMalename();
	((Male)supermarket.employ[2]).setAge(36);
	((Male)supermarket.employ[2]).getAge();
	
	
	supermarket.employ[3] = new Female();
	supermarket.employ[3].jobname="Accountant";
	//((Female)supermarket.employ[3]).salary=8000;
	//((Female)supermarket.employ[3]).femaleemployname="Sarika";
	((Female)supermarket.employ[3]).setfemalesalary(8000);
	((Female)supermarket.employ[3]).getSalary();
    ((Female)supermarket.employ[3]).setfemalename("sarika");
	((Female)supermarket.employ[3]).getfemalename();
	((Female)supermarket.employ[3]).setAge(40);
	((Female)supermarket.employ[3]).getAge();
	
	supermarket.employ[4] = new Male();
	supermarket.employ[4].jobname="Manager";
	//((Male)supermarket.employ[4]).salary=87500;
	//((Male)supermarket.employ[4]).maleemployname="Jagannathan";
	((Male)supermarket.employ[4]).setSalary(35000);
  
	 ((Male)supermarket.employ[4]).setMalename("Jagan Nathan");
	 ((Male)supermarket.employ[4]).getMalename();
	 ((Male)supermarket.employ[4]).setAge(45);
	 ((Male)supermarket.employ[4]).getAge();
	 
	 
	 
	 
	
    supermarket.employ[5]= new Female();
	supermarket.employ[5].jobname="PRO";
	//((Female)supermarket.employ[5]).salary=15000;
	//((Female)supermarket.employ[5]).femaleemployname="Lathakumari";
	((Female)supermarket.employ[5]).setfemalesalary(15000);
	((Female)supermarket.employ[5]).getSalary();
	((Female)supermarket.employ[5]).setfemalename("Latha");
	((Female)supermarket.employ[5]).getfemalename();
	((Female)supermarket.employ[5]).setAge(32);
	((Female)supermarket.employ[5]).getAge();
	
	
	supermarket.employ[6] = new Male();
	supermarket.employ[6].jobname="Hr";
	//((Male)supermarket.employ[6]).salary=29552;
	((Male)supermarket.employ[6]).setSalary(29552);
	((Male)supermarket.employ[6]).getSalary();
	//((Male)supermarket.employ[6]).maleemployname="Vipin";
	((Male)supermarket.employ[6]).setMalename("Vipin");
	((Male)supermarket.employ[6]).getMalename();
	((Male)supermarket.employ[6]).setAge(28);
	((Male)supermarket.employ[6]).getAge();


	
	
	supermarket.employ[7] = new Female();
	supermarket.employ[7].jobname="Billing";
	//((Female)supermarket.employ[7]).salary=12500;
	((Female)supermarket.employ[7]).setfemalename("Anupama");
	((Female)supermarket.employ[7]).setfemalesalary(12500);
    ((Female)supermarket.employ[7]).setAge(52);
	((Female)supermarket.employ[7]).getAge();
	((Female)supermarket.employ[7]).getSalary();
  //((Female)supermarket.employ[7]).femaleemployname="Swapna";

	
	supermarket.employ[8] = new Male();
	supermarket.employ[8].jobname="Salesexicutive";
	//((Male)supermarket.employ[8]).salary=7500;
	((Male)supermarket.employ[8]).setSalary(7500);
	((Male)supermarket.employ[8]).getSalary();
	//((Male)supermarket.employ[8]).maleemployname="AVUKTH";
	((Male)supermarket.employ[8]).setMalename("AVUKTH");
	((Male)supermarket.employ[8]).getMalename();
	((Male)supermarket.employ[8]).setAge(41);
	((Male)supermarket.employ[8]).getAge();
	
	
	
	supermarket.employ[9] = new Female();
	supermarket.employ[9].jobname="Casier";
	////((Female)supermarket.employ[9]).salary=9500;
	((Female)supermarket.employ[9]).setfemalesalary(9500);
	((Female)supermarket.employ[9]).getSalary();
	//((Female)supermarket.employ[9]).femaleemployname="Revathy";
	((Female)supermarket.employ[9]).setfemalename("Revathy");
	((Female)supermarket.employ[9]).getfemalename();
	
	supermarket.floor[0] = new Floor();
	supermarket.floor[0].number=1;
    
	supermarket.floor[1] = new Floor();
	supermarket.floor[1].number=2;
	
	supermarket.floor[2] = new Floor();
	supermarket.floor[2].number=3;

	

   supermarket.showMale();
  
	  
   supermarket.showFeMale();
   
    System.out.println( supermarket.floor());

}

}