package Programs;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 10,a = 0,b=1,c=0;
		System.out.println("Fiboncci Series: "+ a + ","+ b);
		for(int i = 2;i<n ;i++) 
		{
			c= a+b;
			System.out.print(" "+ c);
			a =b;
			b=c;
		}
		
		


	}

}
