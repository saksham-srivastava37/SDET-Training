package saksham;

public class Throw_Catch {
	
		public static void main(String[] args)
		{
		try {
			int bal = 2000;
			
			if(bal <5000)
			{
				throw new Exception("Insufficient Balance !!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
		
}
