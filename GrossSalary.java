public class GrossSalary
{
	public static void main(String args[])
	{
		int salary = 25000; 
		int pension = 2500; 
		double tax = pension * 0.35;
		int medical = 5000; 
		double grossSalary = salary - pension - tax - medical; 
		
		System.out.println("Gross Salary = "+grossSalary); 
	}
}
