public class Steering extends Part{
String shape;


public Steering(String shape,String brandName,String colour){
	
	super(brandName,colour);
	this.shape= shape;
	
	
}

public  Steering(){};

public String toString(){
	return shape+super.toString();
}



public int addSum(int a,int b,int c,int d){
	
	return a+b+c+d;
}

}