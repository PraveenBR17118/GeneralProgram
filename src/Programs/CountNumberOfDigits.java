package Programs;

public class CountNumberOfDigits 
{
	public static void main(String args[]) 
	{
		int num = 126579;
		int count =0;
		while(num!=0) 
		{
			count++;
			num = num/10;
		}
		System.out.println("Number of digits are "+count);
	}

}
