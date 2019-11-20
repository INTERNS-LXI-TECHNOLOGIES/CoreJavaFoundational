package com.lxisoft.domain;
/**
 *pojo: class for set and get contact details
 */
public class Contact
{
	/**
	 *instance variables id, name and number
	 */
	private String contactId;
	private String contactName;
	private String contactNumber;
	/**
	 *to set contact id
	 *
	 *@param id
	 */
	public void setContactId(String contactId)
	{
		this.contactId=contactId;
	}
	/**
	 *to get contact id
	 *
	 *@return contactId
	 */
	public String getContactId()
	{
		return contactId;
	}
	/**
	 *to set contact name
	 *
	 *@param contactName
	 */
	public void setContactName(String contactName)
	{
		this.contactName=contactName;
	}
	/**
	 *to get contact name
	 *
	 *@return contactName
	 */
	public String getContactName()
	{
		return contactName;
	}
	/**
	 *to set contact number
	 *
	 *@param contactNumber
	 */
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber=contactNumber;
	}
	/**
	 *to get contact number
	 *
	 *@return contactNumber
	 */
	public String getContactNumber()
	{
		return contactNumber;
	}
}