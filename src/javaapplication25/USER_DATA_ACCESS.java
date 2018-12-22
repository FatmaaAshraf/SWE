
package javaapplication25;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class USER_DATA_ACCESS {
    
Map<String, String> info = new HashMap<String, String>();
	
    /******************** ADD USER *************************/
	void add_user(String username , String password)
	{
		info.put(username , password);
		
	}
	
	/******************* VERIFY FOR LOGIN *********************/
	void verify_user_info(String username , String password,ArrayList<String>un,ArrayList<String>pas)
	{
            int v=0;
	for(int i=0;i<un.size();i++)
        {
        if(un.get(i).equals(username)&&pas.get(i).equals(password))
        {     System.out.println("log in Succesful");
 
        v=1;
        break;
        }
        else
            v=0;
        
        }
       if(v==0)
                                   System.out.println("log in not Succesful");


            
		
	}
	
	/********************** VERIFY VALIDATION FOR REGISTRTION  **********************/
	boolean verify_validation(String username , String password)
	{
		
		if(username.contains(" ") || username.contains(".") || username.contains("@") )
			return false;
		
		if(password.length()<8)
				return false;
		
		else
			{
				add_user(username, password);
				return true;
			}
	}	

}
