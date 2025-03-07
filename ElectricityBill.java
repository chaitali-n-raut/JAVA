public class ElectricityBill
{
	public static void main(String args[])
	{
		int unit= 128; 
		if(unit==100)
		{
			System.out.println("Electricity Bill = "+(unit*4)+" Rs"); 
		}
		else if(unit>100 && unit<=200)
		{
			System.out.println("Electricity Bill ="+(unit*5)+" Rs"); 
		}
		else if(unit>200)
		{
			System.out.println("Electricity Bill ="+(unit*6)+" Rs"); 
		}
		else if(unit>100)
		{
			System.out.println("Electricity Bill ="+(unit*3)+" Rs"); 
		}
	}
}
