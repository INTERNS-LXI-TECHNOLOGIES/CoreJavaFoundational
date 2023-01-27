public class Hero{
	String[] herowords=new String[3];
	public Hero(String[] herodia ){
		this.herowords=herodia;
	}
	
 void sayherodialog(){
	  System.out.println("\n");
	 int i =(int)(Math.random()*3);
	 System.out.println("Hero: "+herowords[i]);
		 		System.out.println("\n");

	
}
}