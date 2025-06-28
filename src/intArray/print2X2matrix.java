package intArray;

import java.util.*;


public class print2X2matrix 
{
	static int count =0;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int row =  Integer.valueOf(sc.nextLine());
		
		System.out.println("Enter the number of colums");
		int col =  Integer.valueOf(sc.nextLine());
		
		
		
		
		
		int [][] bv = new int[row][col]; 
		for(int i =0;i<row;i++) 
		{
			for(int j =0;j<col;j++) 
			{
				bv[i][j]= count;
				System.out.print(bv[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		
	}

}
