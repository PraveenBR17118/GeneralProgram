package NumberPrograms;

public class reverseNumber {

	public static void main(String[] args) 
	{
		int num = 1028;
		int reve =0;
		int rem;
		while(num>0) 
		{
			rem = num%10;
			reve = (reve*10)+rem;
			num = num/10;
			
		}
		
		System.out.println(reve);
		

	}

}
