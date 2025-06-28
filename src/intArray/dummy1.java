package intArray;

public class dummy1 
{
	public static void main(String[] args) 
	{
		int num =6;
		int temp1=1;
		int temp2=num;
		int temp3=0;
		for(int i=1;i<=num;i++) 
		{
			temp3=temp1;
			for(int j=0;j<i;j++) 
			{
				System.out.print(temp3+" ");
				temp3-=(temp2+j);
			}
			System.out.println();
			temp1+=temp2;
			temp2--;	
		}
	}
}

/*
 * 
 * 1
 * 7 2
 * 12 8 3
 * 16 13 9 4
 * 19 17 14 10 5
 * 21 20 18 15 11 6
 * 
 * */

/*
 * int rows = 6; int[][] pattern = new int[rows][rows]; int value = 1;
 * 
 * // Fill upper triangle for (int col = 0; col < rows; col++) { int i = 0; int
 * j = col; while (j >= 0) { pattern[i][j] = value++; i++; j--; } }
 * 
 * // Fill lower triangle for (int row = 1; row < rows; row++) { int i = row;
 * int j = rows - 1; while (i < rows) { pattern[i][j] = value++; i++; j--; } }
 * 
 * // Print the pattern for (int i = 0; i < rows; i++) { for (int j = 0; j <= i;
 * j++) { System.out.print(pattern[i][j] + " "); } System.out.println(); }
 */


