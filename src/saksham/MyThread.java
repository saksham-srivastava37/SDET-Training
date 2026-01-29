package saksham;


public class MyThread extends Thread{
	
	public void run(){
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.run();

	}

	

}
