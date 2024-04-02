public class Tdd{

public static void main(String[]args){

Car car = new Car();
car.brandname="Alto";


car.part[0] = new Door();
car.part[0].colour="red";
((Door)car.part[0]).length=90;
car.part[0].brandName="Mdsd";


car.part[1] = new Door();
car.part[1]	.colour="red";
((Door)car.part[1]).length=90;	
car.part[1].brandName="Mdsvaj";

car.part[2] = new Door();
car.part[2].colour="red";
((Door)car.part[2]).length=90;
car.part[2].brandName="Msagv";


car.part[3] = new Door();
car.part[3].colour="red";
((Door)car.part[3]).length=90;
car.part[3].brandName="Masjh";

car.part[4]= new  Steering();
((Steering)car.part[4]).shape="Circle";
car.part[4].colour="blue";
car.part[4].brandName="sjdg";


car.part[5] = new Tyre();
car.part[5].colour="Black";
car.part[5].colour="Black";
car.part[5].brandName="MrF";
((Tyre)car.part[5]).kg=60;


car.part[6] = new Tyre();
car.part[6].colour="black";
car.part[6].brandName="MrF";
((Tyre)car.part[6]).kg=60;

car.part[7] = new Tyre();
car.part[7].colour="red";
car.part[7].brandName="MrF";
((Tyre)car.part[7]).kg=60;


car.part[8] = new Tyre();
car.part[8].colour="black";
car.part[8].brandName="MrF";
((Tyre)car.part[8]).kg=60;





System.out.println(car.part[0].addSum(12,23));




System.out.println(((Door)car.part[0]).addSum(12,2,23));


System.out.println(((Steering)car.part[4]).addSum(2,4,5,4));






}

}