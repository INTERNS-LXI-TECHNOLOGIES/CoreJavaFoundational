public class Word {
	
	
	public Word(){
		
		
	}
	
	
private	String meaning;
private	String adjective;
private	String verb;
private	String noun;


public  String getMeaning(){
	
	return this.meaning;
}
public  void setMeaning(String meaning){
	
	 this.meaning=meaning;
}
public  String getAdjective(){
	
	return this.adjective;
}
public  void setAdjective(String adjective){
	
	 this.adjective=adjective;
}
public  String getVerb(){
	
	return this.verb;
}
public  void setVerb(String verb){
	
	 this.verb=verb;
}
public  String getNoun(){
	
	return this.noun;
}
public  void setNoun(String noun){
	
	 this.noun=noun;
}






	
	public String toString(){
		return "\n"+"meaning: "+getMeaning()+"\n"+"\n"+"adjective: "+getAdjective()+"\n"+"\n"+"verb: "+getVerb()+"\n"+"\n"+"noun: "+getNoun()+"\n";
		
		
	}
	
	
}