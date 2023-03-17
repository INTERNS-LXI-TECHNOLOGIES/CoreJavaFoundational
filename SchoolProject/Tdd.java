public class Tdd{
public static void main(String[] args){
int number=5;
String name="asas";
Humanbeing hb= new Humanbeing();
Humanbeing hb1=new Humanbeing();
Humanbeing hb2=new Humanbeing();
hb.name="Divya";
hb1.name="umesh";
hb2.name="sreenidha";

hb1.sayHi();
}
}

class Humanbeing 
{
String name;
public void sayHi() 
{
System.out.println(this.name    +"   says hi");
}
}



