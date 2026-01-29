package saksham;

 class account {
	 private int bal = 10000;
	 
	 
	 
	 
	 synchronized void withdraw(String user, int amt) {
		 System.out.println("Account bal: "+bal);
		 System.out.println(user + " trying to withdraw "+amt);
		 
		 if(bal >= amt) {
			bal = bal - amt;
			System.out.println(user+" withdrawal successful");
			System.out.println("Remaining Bal: "+bal);
			System.out.println();
		}
		 else {
			 System.out.println("Withdrawal failed for "+user+" due to insufficient bal");
			 System.out.println();
		 }
	 }

}
 
 public class USE_CASE_Sync{
	 public static void main(String[] args) {
		 account acc = new account();
		 
		 Thread t1 = new Thread (() -> acc.withdraw("User 1", 5000));
		 Thread t2 = new Thread (() -> acc.withdraw("User 2", 5000));
		 
		 t1.start();
		 t2.start();
	 }
 }
