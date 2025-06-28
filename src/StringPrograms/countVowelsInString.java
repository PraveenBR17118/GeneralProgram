package StringPrograms;

public class countVowelsInString 
{

	public static void main(String[] args) 
	{
		String dtr = "Praveen";
		int Count =0,cont =0; 
		for(char jk : dtr.toLowerCase().toCharArray())
		{
			
			if(jk == 'a' || jk == 'e' || jk == 'i' || jk == 'o' || jk == 'u' ) 
			{
				Count++;
				
			}
			else 
			{
				cont++;
			}
		}
		System.out.println(Count +" "+cont);
	}

}
