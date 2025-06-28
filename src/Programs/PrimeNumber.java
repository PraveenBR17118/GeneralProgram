package Programs;

public class PrimeNumber 
{

	// Natural number >1
	// Which has only 2 factors 1 and itself
	public static void main(String[] args) 
	{
		int num = 13,count = 0;
		if(num>0)
		{
			for(int i = 1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;	
				}
			}
			if(count == 2)
			{
				System.out.println(num+ " is a prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
				
		}
		else
		{	
			System.out.println("Not a prime number");
				
		}
		
	}

}
