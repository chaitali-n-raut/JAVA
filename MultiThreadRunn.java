class MultiThreadRunn implements Runnable
{
	public void run()
	{
		System.out.println("Thread is Running......"); 
	}
	public static void main(String args[])
	{
		MultiThreadRunn m = new MultiThreadRunn(); 
		Thread t = new Thread(m); 
		t.start(); 
	}
}
