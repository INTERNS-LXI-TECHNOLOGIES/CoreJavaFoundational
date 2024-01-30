public class Tdd{

public static void main(String[] args){

   School sch = new School();

   sch.name = "Memunda Higher Secondary school";
   
   System.out.print(sch.name);

   sch.clz = new Classroom();
   
   sch.clz.teach = new Teacher();
   
   sch.clz.stu  = new Student();
   
   sch.clz.teach.name ="\n Ramesh";
   sch.clz.stu.name ="Ajay";
   
   System.out.println(sch.clz.teach.name);
   
   System.out.println(sch.clz.stu.name);
   
   sch.peo = new Peon();
   
   sch.peo.name = "\n ANIL";
   
   sch.peo.age =  55;
   
   System.out.println(sch.peo.name);
   
   System.out.print(sch.peo.age);
   
    
    sch.can = new Canteen();
	
	sch.can.name = "\n Sky  Teashop";
	
	System.out.println(sch.can.name);
   
   
   sch.can.food = new Food();
   
   sch.can.food.name = "meals";
   
   sch.can.food.price = 50;
   
  System.out.println(sch.can.food.name+"is" + sch.can.food.price);
  
  
  
   sch.lb = new Lab();
   
   sch.lb.name =  "Chemistrylab";
   
   System.out.println(sch.lb.name);
   
   sch.lb.clk = new Clock();
   
   
   sch.lb.clk.Brandname = "Ajantha";
   
   System.out.println(sch.lb.clk.Brandname);
 
   
   



  
 
   
   
   
  

   
  

}

}