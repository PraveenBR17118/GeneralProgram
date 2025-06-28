package programingKnowledge;

public class Ststic_VS_Instance 
{
	static int count =0;
	
	Ststic_VS_Instance()
	{
		count++;
		System.out.println(count);
	}
	
	
	public static void main(String[] args) 
	{
		new Ststic_VS_Instance();
		new Ststic_VS_Instance();
		new Ststic_VS_Instance();

	}
	//Output : 1,2,3

}
