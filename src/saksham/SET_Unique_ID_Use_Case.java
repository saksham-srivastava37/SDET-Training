package saksham;

import java.util.*;

public class SET_Unique_ID_Use_Case
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hospital = new HashSet<>();
		ArrayList<String> List = new ArrayList<>();
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of patients: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i =0; i<n; i++) {
			System.out.print("Enter patient's name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter patient's unique ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
//			String data = id + " " + name;
			
			if(hospital.add(id)) {
				List.add("ID: "+id +"-" +"Name: "+name);
				System.out.println("Patient Registration success for "+name);
				System.out.println();
			}
			else {
				System.out.println("Patient already registered with same ID");
				System.out.println();
				
			}
		}
		System.out.println("Registered Patients List ");
		System.out.println("*************************");
		System.out.println(List);
		
		
		sc.close();
		

	}

}
