public class Heroin{
	String[] dialogs=new String[3];
	public Heroin(String[] actresDialogs)
{
		this.dialogs=actresDialogs;
		
}
		
	
	void sayActressDialog(){
		System.out.println("\n");
		int i= (int)(Math.random()*3);
		System.out.println("Heroin: "+dialogs[i]);
	    System.out.println("\n");

}
}