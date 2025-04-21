class MultiThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running....."); 
	}
	public static void main(String args[])
	{
		MultiThread t = new MultiThread(); 
		t.start(); 
	}
}
