package intArray;

import java.util.ArrayList;
import java.util.Scanner;

public class printDivisibleOf9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		int ac = sc.nextInt();
		ArrayList<Integer> hg = new ArrayList<Integer>(ac);
		for(int i =0;i<ac;i++) 
		{
			hg.add(i);
			//System.out.println(hg.get(i)%9);
			int count = (hg.get(i)%9);
			if(count == 0) 
			{
				System.out.println(hg.get(i));
			}
			
			
		}
		//System.out.println(hg);
		
	}

}
