
public class Tdd{
public static void main(String[] args ){

Supermarket supermarket = new Supermarket();

  supermarket.setName("K T P Supermarket");
  supermarket.setLocation("Piller no:225, Edapally");
  supermarket.setMobNumber(9447533989L);
  supermarket.setOwner("K T Pilla");
  
  String[] name = {"Thangamani","Janu","Monisha","Fathima","Princy","Arun","Felix","Gopalan"};
  int[] age = {52,48,25,30,24,28,33,45};
  long[] salary = {15000L,15000L,9500L,11500L,9500L,11500L,12000L,14000L,18000L};

   for (int i=0; i< supermarket.staff.length;i++){
	   if(i<=4){
		   supermarket.staff[i] = new Female(); 
	       supermarket.staff[i].setName(name[i]);
		   supermarket.staff[i].setAge(age[i]);
	       supermarket.staff[i].setSalary(salary[i]);
	   }
	   else{
		   supermarket.staff[i] = new Male();
		   supermarket.staff[i].setName(name[i]);
		   supermarket.staff[i].setAge(age[i]);
	       supermarket.staff[i].setSalary(salary[i]);
	   }
   }
System.out.println("\n"+"***SUPERMARKET***"+"\n");
 
System.out.println(supermarket);
supermarket.showAttendance();
supermarket.showSalaryDetails();
System.out.println("\n"+"***Products***"+"\n");


  String[] food = {"Apples","Bread","Milk","Eggs","Chicken","Rice","Tomatoes","Cheese"};
  String[] drink = {"Water","Orange Juice","Cola","Coffee","Tea"};
  String[] stationaryItems = {"Pen", "Pencil", "Notebook", "Eraser", "Ruler", "Scissors", "Glue Stick", "Highlighter", "Stapler", "Paper Clips", "Whiteboard Marker", "Calculator"};
  int[] price = {10,32,41,25,39,18,45,34,43,29,30,17,35,20,22,40,37,26,10,33,19,28,37,40,45};
   for(int i=0, j=0, k=0; i < supermarket.product.length; i++){
	    if (i<=7){
		  supermarket.product[i] = new Fooditems();
	      supermarket.product[i].setName(food[i]);
		  supermarket.product[i].setRate(price[i]);
         }
        if(i>7 && i<13){
			supermarket.product[i] = new Drinks();
			supermarket.product[i].setName(drink[j]);
			supermarket.product[i].setRate(price[i]);
			j++;
		 }
        if(i>12){
		   supermarket.product[i] = new Stationaries();
			supermarket.product[i].setName(stationaryItems[k]);
			supermarket.product[i].setRate(price[i]);	
		    k++;
		 }
   }


 





}
}