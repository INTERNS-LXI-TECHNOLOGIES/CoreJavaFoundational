public class Dictionary
{
	private Word[] words=new Word[20];
	
	public Word[] getWord()
	{
		 return words;
	}
	public void setWord(Word[] words)
	{
		this.words=words;
		
	}
				public Dictionary()
				{
				for(int i =0 ;i<20;i++)
				words[i]=new Word();
	
				}
				public String toString()
				{
				String value="";
				for( Word w:words)
				{
					if(w.getWord()!=null)
					{
						value=value+w;
						return value;
					}
				}
				return "";
				
				
				}
}