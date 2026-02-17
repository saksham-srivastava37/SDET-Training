package saksham;

public class Thread_Sleep extends Thread {
public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

public static void main(String[] args)
{
	Thread_Sleep t1=new  Thread_Sleep();
	Thread_Sleep t2=new  Thread_Sleep();
	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
	 
	 t1.start();
	 t2.start();
 
}
 
}
 