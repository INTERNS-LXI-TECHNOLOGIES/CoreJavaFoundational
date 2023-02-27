public class Word{

	private String word ;
	private String meaning;
	private String adjective;
	private String noun;
	
	public String getWord()
	{
		return word;
	}
	public void setWord(String word)
	{
		this.word=word;
	}
	
	public String getMeaning()
	{
		return this.meaning;
	}
	public void setMeaning(String meaning)
	{
		this.meaning=meaning;
	}
	
	public String getAdjective()
	{
		return this.adjective;
	}
	public void setAdjective(String adjective)
	{
		this.adjective=adjective;
	}
	
	public String getNoun()
	{
		return noun;
	}
	public void setNoun(String noun)
	{
		this.noun=noun;
	}
	
	
	
	
	

		public String toString()
		{
		return "Word : " + word + "\n"
		+ "Meaning : " + meaning + "\n" 
		+ "Adjective : " + adjective +"\n"
		+ "Noun : " + noun +"\n" ;
		}
		

}