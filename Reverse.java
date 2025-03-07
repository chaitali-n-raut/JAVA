class Reverse
{
	public static void main(String args[])
	{
		int n=125, rev=0, sum=0; 
		while(n>0)
		{
			rev = n%10; 
			sum = (sum*10)+rev; 
			n = n/10; 
		}
		System.out.println("Reversed No = "+sum); 
		if(n==sum)
		{
			System.out.println("No. is Palindrome "); 
		}
		else 
		{
			System.out.println("No. is Not Palindrome "); 
		}

	}
}
