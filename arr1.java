package pascal;

import java.util.Scanner;

public class arr1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int num[]=new int[n];
		int num1[]=new int[n1];
		int i;
		for(i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for (i = 0; i < num1.length; i++) 
		{
			num1[i]=sc.nextInt();
		}
		for (i = 0; i < num1.length; i++) 
     	{
			if(num[i]==num1[i])
			{
				System.out.println("subset");
			}
			else
			{
				System.out.println("not subset");
			}
		}
	}
}
