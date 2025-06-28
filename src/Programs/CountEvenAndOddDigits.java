package Programs;

public class CountEvenAndOddDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 15485;
		int even = 0,odd =0,res=0;
		while(num!=0)
		{
			res = num%10;
			if(res%2 ==0) 
			{
				even++;
			}
			else
			{
				odd++;
			}
			
			num = num/10;
			
		}
		System.out.println("Number even count is " + even);
		System.out.println();
		System.out.println("+_+_+_+_+_+_+_+_+");
		System.out.println("Number odd count is " + odd);
		
		

	}

}
