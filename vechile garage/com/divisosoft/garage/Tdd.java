package com.divisosoft.garage;
public class Tdd{
public static void main(String args[]){
	
	Vechiclegarage garage=new Vechiclegarage();
	garage.setGaragename("Royal garage");
	garage.setPhnnumber(7890657104L);
	
	
String carName[]={"Honda","Tvs","Bajaj","Benz","Bmw"};
String carColor[]={"Black","White","Red","Yellow","Rose"};
int carRegno[]={877,798,233,567,344};

for(int i=0,q=0;i<5;i++){
	garage.vechicle[i]= new Car();
	garage.vechicle[i].setBrandname(carName[q]);
	garage.vechicle[i].setColor(carColor[q]);
	garage.vechicle[i].setRegno(carRegno[q]);
	q++;
}
	
String MotorcycleName[]={"Suzuki","Ford","Ktm","Yamaha","Audi"};
String MotorcycleColor[]={"Brown","Ash","Blue","Green","Orange"};
int MotorcycleRegno[]={867,498,153,890,378};

for(int i=5,q=0;i<10;i++){
	garage.vechicle[i]=new Motorcycle();
	garage.vechicle[i].setBrandname(MotorcycleName[q]);
	garage.vechicle[i].setColor(MotorcycleColor[q]);
	garage.vechicle[i].setRegno(MotorcycleRegno[q]);	
	q++;
}

for(int i=0;i<5;i++){
((Car)garage.vechicle[i]).iscar();	
}
for(int i=5;i<10;i++){
((Motorcycle)garage.vechicle[i]).iscycle();	
}
	
 //System.out.println(garage);
 garage.showcardetails();
 garage.showmotorcycledetails();
 
 
 

}
}


/*for (int i = 0; i<garage.vechicle.length; i++) {
      if (i < 5) { 
        garage.vechicle[i] = new Car();
    } else {
        garage.vechicle[i] = new Motorcycle();
    }
	}

garage.vechicle[0].setBrandname("HONDA");
garage.vechicle[0].setColor("red");
garage.vechicle[0].setRegno(1677);

garage.vechicle[1].setBrandname("benz");
garage.vechicle[1].setColor("black");
garage.vechicle[1].setRegno(2763);

garage.vechicle[2].setBrandname("bmw");
garage.vechicle[2].setColor("white");
garage.vechicle[2].setRegno(3678);

garage.vechicle[3].setBrandname("audi");
garage.vechicle[3].setColor("blue");
garage.vechicle[3].setRegno(4677);

garage.vechicle[4].setBrandname("ford");
garage.vechicle[4].setColor("black");
garage.vechicle[4].setRegno(5175);

garage.vechicle[5].setBrandname("suzuki");
garage.vechicle[5].setColor("white");
garage.vechicle[5].setRegno(664);

garage.vechicle[6].setBrandname("yamaha");
garage.vechicle[6].setColor("yellow");
garage.vechicle[6].setRegno(7656);

garage.vechicle[7].setBrandname("ktm");
garage.vechicle[7].setColor("black");
garage.vechicle[7].setRegno(8533);

garage.vechicle[8].setBrandname("bajaj");
garage.vechicle[8].setColor("brown");
garage.vechicle[8].setRegno(9124);

garage.vechicle[9].setBrandname("tvs");
garage.vechicle[9].setColor("red");
garage.vechicle[9].setRegno(0677);*/



 







	
	
	/*garage.vechicle[0]=new Car(); 
	garage.vechicle[0].setColor("red");
	garage.vechicle[0].setBrandname("honda");
	garage.vechicle[0].setRegno(456);
	System.out.println(garage.vechicle[0].getColor());
	System.out.println(garage.vechicle[0].getBrandname());
	System.out.println(garage.vechicle[0].getRegno());
	
	garage.vechicle[1]=new Car(); 
	garage.vechicle[1].setColor("white");
	garage.vechicle[1].setBrandname("benz");
	garage.vechicle[1].setRegno(3456);
	System.out.println(garage.vechicle[1].getColor());
	System.out.println(garage.vechicle[1].getBrandname());
	System.out.println(garage.vechicle[1].getRegno());
	
	garage.vechicle[2]=new Car(); 
	garage.vechicle[2].setColor("black");
	garage.vechicle[2].setBrandname("bmw");
	garage.vechicle[2].setRegno(456);
	System.out.println(garage.vechicle[2].getColor());
	System.out.println(garage.vechicle[2].getBrandname());
	System.out.println(garage.vechicle[2].getRegno());
	
	garage.vechicle[3]=new Car(); 
	garage.vechicle[3].setColor("blue");
	garage.vechicle[3].setBrandname("audi");
	garage.vechicle[3].setRegno(9786);
	System.out.println(garage.vechicle[3].getColor());
	System.out.println(garage.vechicle[3].getBrandname());
	System.out.println(garage.vechicle[3].getRegno());
	
	garage.vechicle[4]=new Car(); 
	garage.vechicle[4].setColor("brown");
	garage.vechicle[4].setBrandname("ford");
	garage.vechicle[4].setRegno(2345);
	System.out.println(garage.vechicle[4].getColor());
	System.out.println(garage.vechicle[4].getBrandname());
	System.out.println(garage.vechicle[4].getRegno());
	
	garage.vechicle[5]=new Motorcycle(); 
	garage.vechicle[5].setColor("black");
	garage.vechicle[5].setBrandname("suzuki");
	garage.vechicle[5].setRegno(678);
	System.out.println(garage.vechicle[5].getColor());
	System.out.println(garage.vechicle[5].getBrandname());
	System.out.println(garage.vechicle[5].getRegno());
	
	garage.vechicle[6]=new Motorcycle(); 
	garage.vechicle[6].setColor("rose");
	garage.vechicle[6].setBrandname("yamaha");
	garage.vechicle[6].setRegno(9866);
	System.out.println(garage.vechicle[6].getColor());
	System.out.println(garage.vechicle[6].getBrandname());
	System.out.println(garage.vechicle[6].getRegno());
	
	garage.vechicle[7]=new Motorcycle(); 
	garage.vechicle[7].setColor("yellow");
	garage.vechicle[7].setBrandname("ktm");
	garage.vechicle[7].setRegno(865);
	System.out.println(garage.vechicle[7].getColor());
	System.out.println(garage.vechicle[7].getBrandname());
	System.out.println(garage.vechicle[7].getRegno());
	
	garage.vechicle[8]=new Motorcycle(); 
	garage.vechicle[8].setColor("orange");
	garage.vechicle[8].setBrandname("ducati");
	garage.vechicle[8].setRegno(2345);
	System.out.println(garage.vechicle[8].getColor());
	System.out.println(garage.vechicle[8].getBrandname());
	System.out.println(garage.vechicle[8].getRegno());*/
	
	
	
	
	
	
	
	






	
	
	
	
	