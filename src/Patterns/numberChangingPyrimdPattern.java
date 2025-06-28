package Patterns;

public class numberChangingPyrimdPattern 
{

	public static void main(String[] args) 
	{
		int num =1;
		// TODO Auto-generated method stub
		for(int i = 0;i<=6;i++) 
		{
			for(int j= 0;j<=i;j++) 
			{
				System.out.print(num +" ");
				
				num++;
				
			}
			System.out.println();
		}

	}

}
