class OddEvenNoSum
{
	public static void main(String args[])
	{
		int sum=0, add=0; 
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0)
			{
				sum = sum + i;
				  
			}
			else if(i%2==0)
			{
				add = add + i; 
			}
		}
		System.out.println("Addition of Even Numbers From 1 to 100 :"+add); 
		System.out.println("Addition of Odd Numbers From 1 to 100 :"+sum); 
	}
}
