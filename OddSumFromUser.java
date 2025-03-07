import java.util.*; 
class OddSumFromUser
{
	public static void main(String args[])
	{
		int sum=0; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Starting No :"); 
		int st = sc.nextInt(); 
		System.out.println("Enter Ending No :"); 
		int en = sc.nextInt(); 
		for (int i=st;i<=en;i++)
		{
			if(i%2==0)
			{
				sum = sum + i; 
			}
		}
		System.out.println("Addition from "+st+" to "+en+" ="+sum); 
	}
}
