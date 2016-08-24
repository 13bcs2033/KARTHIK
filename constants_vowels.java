import java.util.Scanner;

public class vowel_constant 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u')
		{
			System.out.println("vowels");
		}
		else 
		{
			System.out.println("constants");
		}
	}
	
}
}
