package NumberPrograms;

public class fibonacciSeries 
{

	public static void main(String[] args) 
	{
		int a=0,b=1,c=0,num=10;
		System.out.print("Fibonacci Series "+a + ", "+b+", ");
		for(int i =2;i<num;i++) 
		{
			c=a+b;
			System.out.print(c +", " );
			a=b;
			b=c;
		}
		

	}

}
