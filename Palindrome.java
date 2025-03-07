class Palindrome
{
	public static void main(String args[])
	{
		int n=121, rem=0, sum=0, i; 
		i = n; 
		while(n>0)
		{
			rem = n%10; //1  // 2  //1
			sum = (sum*10)+rem;  //1   //12  //120+1 = 121
			n = n/10;  //12  //1
		}
		System.out.println("Reversed No = "+sum); 
		if(i==sum)
		{
			System.out.println("No. is Palindrome "); 
		}
		else 
		{
			System.out.println("No. is Not Palindrome "); 
		}

	}
}
	
