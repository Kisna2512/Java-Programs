package java_DSA;


import java.util.*;

public class Combination_of_target {

	
	 static void combine(int n,ArrayList<Integer> v,int idx,int k)
	 {
		 
		    
			   
				 if(v.size()==k )
				 {
					 System.out.println(v);
					 return;
				 }
				
			 
			 
			
		 
		 
		 for(int i=idx;i<=n;i++)
		 {
			 v.add(i);
			 combine(n,v,i+1,k);
			 v.remove(v.size()-1);
		 }
		 
		

		 
	 }
	
	
	
	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		ArrayList<Integer> v=new ArrayList<>();
		
		combine(n,v,1,k);

	}

}
