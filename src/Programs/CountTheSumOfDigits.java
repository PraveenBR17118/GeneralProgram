package Programs;

public class CountTheSumOfDigits 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int mun = 1234;
		int res =0;
		while(mun!=0)
		{
			res = res+(mun%10);
			mun = mun/10;
		}
		System.out.println(res);
		

	}

}
