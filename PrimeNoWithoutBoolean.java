public class PrimeNoWithoutBoolean
{
	public static void main(String args[])
	{
		int n = 2; 
		int flag =0; 
		if(n==2)
		{
			System.out.println("No. is Prime"); 
		}
		else 
		{
			for(int i=2;i<=n;i++)
			{
				if(n%2==0)
				{
					flag = 1; 
				}
				else
				{
					flag = 0; 
				}
			}
			if(flag==1)
			{
				System.out.println("No. is not Prime No."); 
			}
			else
			{
				System.out.println("No. is Prime No. "); 
			}
		}
		
	}
}
