package com.lxisoft.contactapp.controller;
import com.lxisoft.contactapp.model.*;
import com.lxisoft.contactapp.view.*;
import com.lxisoft.contactapp.contactrepo.*;
import java.util.*;
public class Controller{
public ArrayList<Contact> contacts=new ArrayList<Contact>();
Repository repo=new  Repository();
public void save(Contact cc)
{
contacts.add(cc);
 repo.setFile(cc);

}


public ArrayList<Contact> read(){
	return repo.getList();

  }


public Contact search(String n){
	String name=n;
	Contact contact=repo.searchList(name);
	return contact;
/*	Contact c=null;
	int count=0;
for(int i=0;i<contacts.size();i++){
	if(n.equals(contacts.get(i).getName())){
		count++;
		c=contacts.get(i);
      }
   }
   if(count==1){
   		return c;
   }
   else{
   	return null;
   }*/
 }
 
public void update(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
          }
       }
} 
public void delete(String cn){
for(int i=0;i<contacts.size();i++){
	if(cn.equals(contacts.get(i).getName())){
		contacts.remove(i);
          }
       }
} 



}