package javaapplication25;

import java.io.*;
import java.util.*;
public class item {
 
 private String name;
  private   int id;
   private ArrayList<String>question=new ArrayList<String>();
      public static ArrayList<String>itemLostWithDiscription=new ArrayList<String>();
      public static ArrayList<String>itemfoundWithDescription=new ArrayList<String>();


   private String finderName;
    public void setName(String namee,int i) {
        this.name = namee;
      int y=i;
        if(y==1)
            itemLostWithDiscription.add(namee);
        else if(y==2)
        {
            itemfoundWithDescription.add(namee);
        
        
        }
    
        
    }
    	

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(ArrayList<String> question) {
        this.question = question;
    }

    public void setFinderName(String finderName) {
        this.finderName = finderName;
    }
  

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getQuestion() {
        return question;
    }

    public String getFinderName() {
        return finderName;
    }
    
}
