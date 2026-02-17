package saksham;

import java.util.*;

public class SET_HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			String a = sc.next();
			String b = sc.next();
			
			String pair = a + " " + b;
			
			set.add(pair);
			System.out.println(set.size());
		}
		

	}

}
