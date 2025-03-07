public class Armstrong 
{
	public static void main(String args[])
	{
		int n=148, rem=0, sum=0, i; 
		i = n;
		while(n>0) 
		{	
			  	
			rem = n % 10; //3   //5  //1
			sum = sum +(rem*rem*rem); //27  + 125  +1
			
			n= n/10; //15  //1

		}
		System.out.println("Sum of Cubes of Digit in Number :"+sum); 
		if(sum == i)
		{
			System.out.println("No. is  Armstrong No."); 
		}
		else 
		{
			System.out.println("Sum is not Equal to Original No. So No. is not Armstrong NO. "); 
		}
		
		

	}
}
