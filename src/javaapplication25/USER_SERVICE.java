
package javaapplication25;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;
import static javaapplication23.item.itemfoundWithDescription;

public class USER_SERVICE {
    Scanner input = new Scanner(System.in);
    ArrayList<String>na=new ArrayList<String>();
        ArrayList<String>un=new ArrayList<String>();
    ArrayList<String>pas=new ArrayList<String>();

 

	/******************** SEARCH ************************/
void Search_for_item(String itemname) 
	{
		
           
            item it=new item();
              
                for(int i=0;i<it.itemfoundWithDescription.size();i++)
                {
                if(it.itemfoundWithDescription.get(i).equals(itemname))
                	{
                    System.out.println("item  founded");
			exit(0);
                	}
                
                }
                 System.out.println("item not  founded");
          
	}
	
	/****************** POST***********************/
	void post_item() 
	{
         	item i = new item();
				String m,k;
    	  		System.out.println("writre the title post");
    	  		k=input.next();
    	  		System.out.println("writre the post");
    	  
    	  		m=input.next();
    	  		i.setName(k,1);

	}
	
	
	/****************** REGISTER ************************/
	void register ()
	{USER s = new USER ();
        String name,password,username;
		String result="";
		System.out.print("Enter name : ");
		name= input.next();
		s.set_name(name);
		
		System.out.print("Enter Username : ");
		username= input.next();
		s.set_username(username);
		
		System.out.println("Enter password : ");
		password= input.next();
		s.set_password(password);
               boolean n = false;
       //          x.add("");
         //       y.add("");
           //     z.add("");
               USER_DATA_ACCESS r = new USER_DATA_ACCESS();
		
		boolean check = r.verify_validation(username , password);
		if(check == false)
                {System.out.println( "Falied registration may password less than 8 or user name contains. or @ or space");
		
                exit(0);
                }
                else
                if(un.contains(username))
                System.out.println("this user name already used");
                
                else
                {
               
                
                 na.add(name);
                pas.add(password);
                un.add(username);
                
		
                }
		
	}
	
	/****************** LOGIN *****************************/
	void login()
	{USER e = new USER();
	String username ;
        String password;
		System.out.print("Enter Username : ");
		username= input.next();
		e.set_username(username);
		
		
		System.out.println("Enter password : ");
		password= input.next();
		e.set_password(password);
		
		
		USER_DATA_ACCESS u = new USER_DATA_ACCESS();
                
		u.verify_user_info(username , password,un,pas);
              
		
	}
	
	/****************** ANSWER QUESTIONS ******************/
	void answer_questions()
	{
		
		
	}
	
	/****************** CONNECT PERSON ********************/
	boolean connect_person(String name) 
	{
		
		return true;
	}
}
