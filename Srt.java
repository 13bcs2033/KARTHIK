import java.util.Scanner;

public class Srt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1=1,rev;
		int tem=n;
	//	String str = sc.next();
		while(n>0)
		{
			rev=n%10;
			n1=n1*rev;
			n/=10;
		}
		int sum=n1*tem;
		System.out.println(sum);
	}
}
