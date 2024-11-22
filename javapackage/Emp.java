package javapackage;

public class Emp {
	
	private String name;
	private int id;
	
	void setname(String name1)
	{
		 name= name1;
	}
	
	String getname()
	{
		System.out.println(name);
		return name;
		
	}

	void setid(int id1)
	{
		id = id1;
	}
	
	int getid()
	{
		System.out.println(id);
		return id;
	}
}

