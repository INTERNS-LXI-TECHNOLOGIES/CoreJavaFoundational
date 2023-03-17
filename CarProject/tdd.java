public class tdd{
public static void main(String[] args){
int number=5;
String name="asas";
Humanbeing hb= new Humanbeing();
Humanbeing hb1=new Humanbeing();
Humanbeing hb2=new Humanbeing();
hb.name="Divya";
hb1.name="umesh";
hb2.name="sreenidha";

hb1.Sayhi();
}
}

class Humanbeing 
{
String name;
public void Sayhi() 
{
System.out.println(this.name    +"   says hi");
}
}



