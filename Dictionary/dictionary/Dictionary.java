public class Dictionary{
	private Word[] words = new Word[20];
    private	String wordd;
	
	public  Word[] getWords(){
	
	return this.words;
}
public  void setWords(Word[] words ){
	
	 this.words=words;
}
public  String getWordd(){
	
	return this.wordd;
}
public  void setWordd(String word ){
	
	 this.wordd=word;
}
	
	
	public Dictionary(){
		for(int i =0;i<20;i++){
			
			words[i]=new Word();
			
		}
		
	}
	
	
	
	public String toString(){
		String returning="";
		for(Word word: words ){
			if(word.getMeaning()==null){

				continue;
			}else{
				
		     returning=returning+word+"\n";	
		
	}
	
	}
       return returning;	
}
}
	
	

	
