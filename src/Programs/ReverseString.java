package Programs;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//++++++++++++++++++++++++++++++++++++++++++++
		// 1. method using String Concatenation 
		String str = "Automation";
		int len = str.length();
		String res = "";
		for(int i = len-1;i>=0;i--) 
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		
		// 2. Using Character array
		String Inp = "praveen";
		char ch[] = Inp.toCharArray();
		int si = Inp.length();
		String out = "";
		for(int i = si-1;i>=0;i--) 
		{
			out=out+ch[i];
		}
		System.out.println(out);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		
		// 3. Using StringBuilder class
		String fd = "Girish";
		StringBuilder sb = new StringBuilder(fd).reverse();
		System.out.println(sb);
		System.out.println("+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_");
		
		
		
		

	}

}
