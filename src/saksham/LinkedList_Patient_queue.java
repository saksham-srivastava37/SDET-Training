package saksham;

import java.util.*;

public class LinkedList_Patient_queue {
	public static void main(String[] args) {
		
		LinkedList<String> patients = new LinkedList<>();
		
		patients.add("Lucas");
		patients.add("El");
		patients.add("Mike");
		patients.add("Max");
		patients.add("Nancy");
		
		patients.addFirst("Emergency:Steve");
		
		System.out.println("Patients Queue: "+patients.toString());
		
		System.out.println("First in the queue: "+patients.getFirst());
		System.out.println("Last in the queue: "+patients.getLast());
		
		System.out.println("Is Max in queue ? - " +patients.contains("Max"));
		System.out.println("Is Nancy here ? - " +patients.contains("Nancy"));
		System.out.println("Is Chris Present ? - "+patients.contains("Chris"));
		
		System.out.println("Position of Mike : "+patients.indexOf("Mike"));
		System.out.println("Position of Lucas: "+patients.indexOf("Lucas"));
		
		System.out.println("Patient Treated: "+patients.removeFirst());
		System.out.println("Updated Patients List: "+patients.toString());
				
		
		
//		for(String Patient: patients) {
//			System.out.println(patients);
//		}
	}

}
