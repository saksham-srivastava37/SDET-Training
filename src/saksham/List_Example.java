package saksham;

import java.util.*;

public class List_Example {
public static void main(String[] args)
	{
List<String> names=new ArrayList<>();

//ArrayList<String> name= new ArrayList<>();
//ArrayList<String> name1= new ArrayList();

		names.add("Saksham ");
		names.add("Srivastava");
		names.add("SS");
		names.addFirst("Hello");
		names.addLast("Bye");
		names.set(4, "Python");
		
		
		System.out.println(names);
		System.out.println(names.get(0));
		System.out.println(names.indexOf("SS"));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		
	}
 
}
 
