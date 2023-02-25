public class Dictionary
{
private Word[] words = new Word[10];


public Word[] getWords()
{
return words;	
}
public void setWords(Word[] words)
{
this.words = words;	
}

public Dictionary()
{
for(int i=0; i<words.length; i++)
{
words[i] = new Word();
}
}
public String toString()
{
    String returnString = "";
    
    for (Word word: words)
    {
       if (word.getWord()!=null){

        returnString = returnString + word;	 
        
      return returnString; 
       }
       
    }
    return "";
    
    }		 
}