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
	
	
	
	
	
	private String submit;

	
   public String getSubmit()
     {
	  return submit;
     }
   public void setSubmit(String submit)
        {
	      this.submit = submit;
		}
	
	
public Login()
{
	this.userId="abc";
	this.passWord="123";
	
}	

}