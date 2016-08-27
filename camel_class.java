import java.util.Scanner;
public class camel_class 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
			String s[]=str.split(" ");
			for(String sa:s)
			{
				int index = 0;
				char ch=sa.charAt(index);
				if(Character.isLowerCase(ch))
				{
					System.out.print(Character.toUpperCase(ch)+sa.substring(1)+" ");
				}
			}
			//System.out.println(s);	
		
		
		//if(Character.isLowerCase(s.charAt(i)))

	}

}
