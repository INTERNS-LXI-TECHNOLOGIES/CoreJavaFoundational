public class Part{
	
	String brandName;
	String colour;
	
	
	
	public Part(String brandName,String colour){
		 this.brandName=brandName;
		 this.colour=colour;
		
	}
	public Part(){};
	
	
	
	public String toString(){
		
		return brandName+colour+"\n";
	}
	
	
	public int addSum(int a,int b){
		
		return a+b;
	}
	

}