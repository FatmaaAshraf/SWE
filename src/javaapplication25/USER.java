
package javaapplication25;

import java.io.*;
import java.util.*;
public class USER {
    private	String name="";
	private	String username="";
	private	String password="";
	private	int id;
	
	
	public ArrayList<item> items;
	public String get_name()
	{
		return name;
	}

	public void set_name(String n)
	{
		name = n;
	}
	
	public String get_username()
	{
		return username;
	}

	public void set_username(String u)
	{
		name = u;
	}
	
	public String get_password()
	{
		return password;
	}

	public void set_password(String p)
	{
		password=p;
	}
	
	public int get_id()
	{
		return id;
	}

	public void set_id(int i)
	{
		id = i;
	}
	
	
	
}
