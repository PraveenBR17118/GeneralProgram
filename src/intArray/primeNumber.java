package intArray;

import java.util.*;

public class primeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter is integer");
		int na = sc.nextInt();
		int num =na;int count =0;
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
				System.out.println(num +" number is prime");
			}
			else 
			{
				System.out.println(num +" number is not prime");
			}
		}
		else 
		{
			System.out.println(num +" is not a prime number");
		}

	}

}
