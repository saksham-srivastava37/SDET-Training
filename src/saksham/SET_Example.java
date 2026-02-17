package saksham;

import java.util.*;

public class SET_Example {
public static void main(String[] args)
	{
TreeSet<String>cities=new TreeSet<>();
		
		try {
			
			cities.add("Delhi");
			cities.add("Mumbai");
			cities.add("Chennai");
			cities.add("Delhi");
			cities.add(null);	
		}
catch(NullPointerException e)
		{
	System.out.println(cities);
	System.out.println("Null value not allowed in Treeset");
 
		}
}
}
