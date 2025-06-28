package Programs;

public class LargestOfThreeNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a =100,b=2200,c=300;

		if(a>b && a>c)
		{
			System.out.println("A is Largest number "+ a);
		}
		else if(a<b && c<b)
		{
			System.out.println("B is Largest number "+ b);
		}
		else
		{
			System.out.println("C is Largest number "+ c);
		}
		
		int largest = a>b?a:b;
		int largest1 = largest>c?largest:c;
		System.out.println(largest1+" is Largest number ");
		
		int largets3 = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largets3+" is Largest number ");
	}

}
