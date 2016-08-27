import java.util.Scanner;


public class least_number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//int n[] = new int[num];
		//int count=0;
		String s=String.valueOf(num);
		char[] ch = s.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(ch[i]<ch[i+1])
				{
					ch[i]=ch[i+1];
					System.out.print(ch[i]);
				}
			else
			{
				if(ch[i]>ch[i+1])
				{
					ch[0]=ch[i];
					System.out.println(ch[0]);
				}
			}
				
			}
			
		}
		}


