class FinallyKeyword
{
	public static void main(String args[])
	{
		try
		{
			int [] array = {1,2,3}; 
			System.out.println("Element At 2nd Index :"+array[2]); 
			System.out.println("Element At 10th Index :"+array[10]); 
		}
		catch(Exception e)
		{
			System.out.println("!!!Wrong Index!!!"); 
		}
		finally
		{
			System.out.println("Program Executed Successfully"); 
		}
	}
}

