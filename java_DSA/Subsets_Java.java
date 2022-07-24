package java_DSA;

import java.util.*;
public class Subsets_Java {

	   private static void fun(int [] arr,int n,ArrayList<Integer> v,int idx)
	   {
		   if(idx==n)
		   {
			  
				   System.out.println(v);
			   
			   return;
		   }
		   

			   v.add(arr[idx]);
			   fun(arr,n,v,idx+1);
			   v.remove(v.size()-1);
			    

		   
		   fun(arr,n,v,idx+1);
		   
		   
		   
		   
	   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> v=new ArrayList<>();
		fun(arr,n,v,0);
		

	}

}
