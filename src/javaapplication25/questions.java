
package javaapplication25;
import java.io.*;
import java.util.*;

public class questions {
 private  ArrayList<String>quest=new   ArrayList<String>();
questionService use = new questionService();
 
    public ArrayList<String> getQuest() 
    {
        return quest;
    }

    public void setQuest(ArrayList<String> quest)
    {
        this.quest = quest;
    }
    
    
}
