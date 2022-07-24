package java_DSA;

import java.util.Scanner;

public class Yes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			t--;
			String s=sc.next();
			if(s.equalsIgnoreCase("YES"))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}

	}

}
