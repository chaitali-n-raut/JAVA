 import java.util.*; 
 class PrimeNo
 {
 	public static boolean isPrime(int n)
 	{
 		for(int i=2;i<n;i++)	
 		{
 			if(n%i == 0)	// 17%2=1
 			{
 				return false; 
 			}
 			
 		}
 		 return true;
 	}
 	public static void main(String args[])
 	{
 		
 		int n = 16;
 		 
 		if(isPrime(n))
 		{
 			System.out.println("No. is Prime"); 
 		}
 		else 
 		{
 			System.out.println("No. is Not Prime"); 
 		}
 	}
 }
