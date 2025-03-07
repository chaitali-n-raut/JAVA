class LeapYear
{
	public static void main(String args[])
	{
		int year=1997; 
		if(year%4==0) // After year 2000
		{
			System.out.println("Year is Leap Year"); 
		}
		else if(year%400==0 || year%4==0) // Before year 2000
		{
			System.out.println("Year is Leap Year"); 	
		}
		else
		{
			System.out.println("Year is not Leap Year"); 		
		}
	}
}
