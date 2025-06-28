package intArray;

public class ArmStrong 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 153;
		int n= num;
		int reminder =0;
		int response = 0;
		while(num>0) 
		{
			reminder = num%10;
			
			response= response+(reminder*reminder*reminder);
			
			num = num/10;
			
		}
		
		if(n ==response ) 
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		System.out.println();
		int nyd = 121; int wqs =nyd;
		int rem=0;
		int res= 0;
		for(;nyd>0;) 
		{
			rem =nyd%10;
			res= res+(rem*rem*rem);
			nyd/=10;
			
		}
		System.out.println(res);
		if(res== wqs) 
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}

	}

}
