public class Tdd
{
public static void main(String[] jayaram)
{
	   System.out.println("~~~~~~~~~~~~~~JEERAF~~~~~~~~~~~~~~~");	
	Animal jeeraf = new Jeeraf();
	jeeraf.name = "lilly";
	((Jeeraf)jeeraf).height = 93;
	((Jeeraf)jeeraf).animalsMethod();
	
	   System.out.println("~~~~~~~~~~~~~TIGER~~~~~~~~~~~~~~~");
	Animal tiger = new Tiger();
	tiger.name = "simba";
	((Tiger)tiger).color = "yellow";
    ((Tiger)tiger).tigers();
	 
	   System.out.println("~~~~~~~~~~~~~~LION~~~~~~~~~~~~~~~");
    Animal lion = new Lion();
	lion.name = "mufasa"; 
    ((Lion)lion).speed = 99;
	((Lion)lion).lions();	
}
}