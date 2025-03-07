class JavaArray
{
	
	public static void main(String args[])
	{
		int[] a = {1,2,3,4,5}; 
		int i; 
		System.out.println("Array Elements are :"); 
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "); 
		}
		
		// To Find Addition of All array elements
		int total = 0; 
		for( i=0;i<a.length;i++)
		{
			total = total + a[i]; 
		}
		System.out.println("Total of All Array Elements :"+total); 	
		
		// To Find Maximum Values amoung all array values
		int max = a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i] > max)  //max = 1 a[1]=2      //max=2 a[2]=3   //max=3 a[3]=4   //max=4 a[4]=5
			{
				max = a[i]; // max = 2	3  4  5<=max
			}
		}
		System.out.println("Maximum Array Element :"+max); 
		
		// To Find Minimum Values amoung all array values
		int min = a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i] < min)
			{
				min = a[i]; 
			}
		}
		System.out.println("Maximum Array Element :"+min);
		
		
		//To Sort Array List in Ascending Order
		int temp; 
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)  //Bubble sort
			{
				if(a[i]<a[j])
				{
					temp = a[i]; 
					a[i] = a[j];
					a[j] = temp; 
				}
			}
		} 
		System.out.println("Array Elements in Ascending Order :"); 
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]); 
		}
		
		
		//To Sort Array List in Descending Order
		
		for(i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) //Bubble sort
			{
				if(a[i]>a[j])
				{
					temp = a[i]; 
					a[i] = a[j];
					a[j] = temp; 
				}
			}
		} 
		System.out.println("Array Elements in Descending Order :"); 
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]); 
		}
			
	}
}
