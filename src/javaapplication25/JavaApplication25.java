
package javaapplication25;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication25 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//Sign in

  USER u=new USER();
  USER_SERVICE us=new USER_SERVICE();
  item i=new item();
  questionService qs=new questionService();
  questions q=new questions();
  USER_DATA_ACCESS uda=new USER_DATA_ACCESS();
  itemDataAccess ida=new itemDataAccess();
  itemService is=new itemService();
 
  int c;
 
 
do
{
 System.out.println("enter 1 to register ,2 to log in");
  c=input.nextInt();
  if(c==1)
  us.register();
  else if(c==2)
      us.login();
  

}
while(c==1||c==2);
 
  do
{
 System.out.println("enter 1 if you finder ,2 if you loseItem");
  c=input.nextInt();
  if(c==1)
  {
  
  String name;
  System.out.println("enter the name of item that founded");
  name=input.next();
  is.add(name, 2);
  
  }
  else if(c==2)
  {
      int b;
      System.out.println("enter 1 to post,2 to search");
      b=input.nextInt();
     
      
      if(b==1)
      {
      String m,k;
       System.out.println("writre the title post");
      k=input.next();
      System.out.println("writre the post");
      m=input.next();
        i.setName(k,1);
      
      
      
      } 
      else if(b==2)
              {
                   String n;
            System.out.println("enter name of item that lost");
            n=input.next();
           us.Search_for_item(n);
            

                
                    
              } 
                    


      
      
  
  
  }
  

}
while(c==1||c==2);
    }
    
}
