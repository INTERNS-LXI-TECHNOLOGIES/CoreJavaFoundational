import java.util.Scanner;

public class TDD {

public static void main(String [] args)  {

Scanner sc = new Scanner(System.in);

for(int i = 1; i <=3; i++)  {

Car c = new Car("brand"+i,"model"+i,"registerNo"+i,"colour"+i,"price"+i);
System.out.println("CAR :" +i);


for(int j = 1; j <5; j++)  {

if(j==1)  {
Tyre tyre = new Tyre("brand"+i+j,"position"+i+j,"R-"+i+j);
c.tyres[0]  = tyre;
}
if (j==2)  {

Tyre tyre2 = new Tyre("brand"+i+j,"position"+i+j,"R-"+i+j);
c.tyres[1] = tyre2;
}

if(j==3)  {
Tyre tyre3 = new Tyre("brand"+i+j,"position"+i+j,"R-"+i+j);  
c.tyres[2] = tyre3;
}
if(j==4)  {
Tyre tyre4 = new Tyre("brand"+i+j,"position"+i+j,"R-"+i+j);
c.tyres[3] = tyre4;
}
}
c.printDetails();

}
}

}


