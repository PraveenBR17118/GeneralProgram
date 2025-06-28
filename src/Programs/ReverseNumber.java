package Programs;


public class ReverseNumber {

	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number");
		//int num = sc.nextInt();
		int num = 12345;
		
		
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		System.out.println();
		
		
		// Using String buffer
		int numnum1 = 7890;
		StringBuffer sr = new StringBuffer(String.valueOf(numnum1));
		StringBuffer ou = sr.reverse();
		System.out.println(ou);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		System.out.println();
		
		// Using String builder
		int numm1 = 35489;
		StringBuilder se = new StringBuilder();
		se.append(numm1);
		StringBuilder res = se.reverse();
		System.out.println(res);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
	}

}
