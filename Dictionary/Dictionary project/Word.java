public class Word
{
private String word; 
private String meaning;
private String verb;
private String adjective;



public String getWord() {
	return word;
}



public void setWord(String word) {
	this.word = word;
}



public String getMeaning() {
	return meaning;
}



public void setMeaning(String meaning) {
	this.meaning = meaning;
}



public String getVerb() {
	return verb;
}



public void setVerb(String verb) {
	this.verb = verb;
}



public String getAdjective() {
	return adjective;
}



public void setAdjective(String adjective) {
	this.adjective = adjective;
}



public String toString()
{
String returnString = "";	
returnString = returnString + "Word : " + word + "\n";
returnString = returnString + "Meaning : " + meaning + "\n";
returnString = returnString + "Verb : " + verb + "\n";
returnString = returnString + "Adjective : " + adjective + "\n";

return returnString;
}
}