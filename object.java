package Maths_DSA;


class kartik_{
	int a=56,b;
	kartik_() // Default
	{
		System.out.println("Brush");
	}
	
	//Parameterized
	kartik_(int p)
	{
		System.out.println("The value in parametrized constuctor is: "+p);
	}
	
	void add(int a,int b)
	{
		System.out.println("=>"+(a+b));
	}
	void add(double a,double b)
	{
		System.out.println("addition is "+(a+b));
	}
	
	
	
	int data=10;
	
	void display()
	{
		System.out.println("Sleeping ");
	}
	
	// Encasultion
	
}










public class object {

	public static void main(String[] args) {
//		System.out.println("kartik"); single line comment
		
		
	/*	1
		2
		3
		4
		5 */ //multiline comment
		
		int a=5; // 4 byte =32-bit
		byte b=5; // 1byte=8 bit
		
		short c=4; // 2 byte=16-bit
		long  t=1999999999;// 8 byte=64bit
		
		System.out.println(a);
		System.out.println(b);;
//		+,-,*,/,%
		// <,> ,<=.
//		&&,||,^~
		
		String str="Hello Krishna";
//		String str1=str.toUpperCase();
		String str1=str.toLowerCase();
		
		System.out.println(str1);
		kartik_ k=new kartik_(27); // object creation
		System.out.println(k.data);
		k.add(4, 8);
		k.add(56.70, 34.20);
		//Method Overloading
		
		
		
		
		
		
		

	}

}

