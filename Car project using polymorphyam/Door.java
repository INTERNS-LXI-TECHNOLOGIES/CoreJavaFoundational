public class Door extends Part{



int length;

public Door(int length,String brandName,String colour){
	
	super(brandName,colour);
	this.length=length;
}

public Door(){};


public String toString(){
	
	return ""+length+super.toString();
	
	
}

public int addSum(int a,int b,int c){
	
	
	return a+b+c;
}




}