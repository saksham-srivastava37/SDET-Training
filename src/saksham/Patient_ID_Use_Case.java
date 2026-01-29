package saksham;

import java.util.*;

public class Patient_ID_Use_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> patients = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Patient");
			System.out.println("2. Update Patient");
			System.out.println("3. Get Patient");
			System.out.println("4. Remove Patient");
			System.out.println("5. List Patients");
			System.out.println("6. Check Patient");
			System.out.println("7. Count Patients");
			System.out.println("8. Clear List");
			
			System.out.println();
			
			System.out.print("Enter action: ");
			int act = sc.nextInt();
			
			switch(act) {
			
			case 1:
				System.out.print("Enter Patient ID :");
				int id = sc.nextInt();
				sc.nextLine();
					
				System.out.print("Enter Patient name: ");
				String name = sc.nextLine();
				
				patients.put(id, name);
				
				System.out.println("Patient details added.");
				System.out.println();
				break;
				
					
			case 2:
				System.out.print("Enter Patient ID: ");
				id = sc.nextInt();
				sc.nextLine();
				
				if(patients.containsKey(id)) {
					System.out.print("Enter new name: ");
					name = sc.nextLine();
					patients.put(id, name);
					
					System.out.println("Patient details updated.");
					System.out.println();
				}
				else {
					System.out.println("Details not found.");
					
				}
				System.out.println();
				break;
				
			
			case 3:
				System.out.print("Enter patient ID: ");
				id = sc.nextInt();
				System.out.println("Name: "+patients.get(id));
				System.out.println();
				break;
				
			case 4:
				System.out.print("Enter patient ID: ");
				id = sc.nextInt();
				patients.remove(id);
				System.out.println("Patient removed.");
				System.out.println();
				break;
				
				
			case 5:				
				System.out.print(patients);
				System.out.println();
				break;
				
			case 6:
				System.out.print("Enter patient ID: ");
				id = sc.nextInt();
				System.out.println(patients.containsKey(id));
				System.out.println();
				break;
				
			case 7:
				System.out.println("Total patients: "+patients.size());
				System.out.println();
				break;
				
				
			case 8:
				patients.clear();
				System.out.println("Record cleared");
				System.out.println();
				break;
				
				
			default:
				System.out.println("No action");
				System.out.println();
			}
		}
		
		
		
		

	}

}
