package Maths_DSA;

import java.util.*;

public class Addition_of_2D_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int [][] arr=new int[3][3];
	   
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			   arr[i][j]=sc.nextInt();
		   }
	   }
	   
	   
	   int sum_row;
	   int sum_col;
	   
	   for(int i=0;i<3;i++)
	   {
		   for(int j=0;j<3;j++)
		   {
			  System.out.print(arr[i][j]+" ");
		   }System.out.println();
	   }
	   
	   for(int i=0;i<3;i++)
	   {
		   sum_row=0;
		   for(int j=0;j<3;j++)
		   {
			 sum_row+=arr[i][j];
		   }
		   System.out.println("The sum of row "+(i+1)+" is "+sum_row);
		
		 
	   }
	   
	   System.out.println();
	   for(int i=0;i<3;i++)
	   {
		   sum_col=0;
		   for(int j=0;j<3;j++)
		   {
			 sum_col+=arr[j][i];
		   }
		   System.out.println("The sum of col "+(i+1)+" is "+sum_col);
		
		 
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		

	}

}
