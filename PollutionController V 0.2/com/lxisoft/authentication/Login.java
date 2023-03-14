package com.lxisoft.authentication;

public class Login
{
	
private String userId;




public String getUserId()
    {
	  return userId;
    }
    public void setUserId(String userId)
        {
	      this.userId = userId; 
		}
		
		
private String passWord;

	
   public String getPassWord()
     {
	  return passWord;
     }
   public void setPassWord(String passWord)
        {
	      this.passWord = passWord;
		}
	
	
	
public Login()
{
	this.userId="AmruthaSajeev";
	this.passWord="amrutha101sajeev";
	
}	

}