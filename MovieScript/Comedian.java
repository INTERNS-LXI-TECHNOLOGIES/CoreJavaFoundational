public class Comedian{
String[] comedy=new String[3];
public Comedian(String[] comedyss){
	this.comedy=comedyss;
	
}

void sayComedy(){
	System.out.println("\n");
	 int i =(int)(Math.random()*3);
	 System.out.println("comedian: "+comedy[i]);
		 		System.out.println("\n");
	
}

}