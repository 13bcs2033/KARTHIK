
import java.util.Scanner;

public class larger_number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num[]=new int[n];
		int i;
		for( i=0;i<n;i++)
		{
		 num[i]=sc.nextInt();
		}
		
		for(i=0;i<num.length-1;i++)
		{
			if(num[i]<num[i+1])
			 num[0]=num[i+1];
			
		}
		System.out.println(num[0]);
	}

}
