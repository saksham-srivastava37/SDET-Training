package saksham;

import java.util.*;

public class Hash_Map_Ex_1 {
public static void main(String[] args)
{
Map<Integer, String>Employee = new HashMap<>();
//HashMap<Integer, String>Employee1= new HashMap<>();
 
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, " Renu ");
		
		
		
//		Employee.size();
		
//		Employee.replace(102, "Sonali", "Ram");
		
	  
		
		System.out.println(Employee);
		
		System.out.println(Employee.size());
		
		Employee.replace(102, "Ram");
		
		System.out.println(Employee);
		
		System.out.println(Employee.containsKey(101));
		
		System.out.println(Employee.containsValue(" Vinay "));
		
		Employee.remove(101, " Vinay ");
		
		System.out.println(Employee);
		
		Employee.clear();
		
		System.out.println(Employee);
		
//		System.out.println(Employee.replace(102, "Sonali", "Ram"));
 
	}
 
}
