package Maths_DSA;

//Leetcode


class x
{
	int a;
	x()
	{
		System.out.println("Im class x constructor");
	}
	void setA(int i)
	{
		a=i;
	}
	
}

class Y extends x
{
	Y()
	{
		System.out.println("I'm Class Y constructor");
	}
	int b;
	void setB(int i)
	{
		b=i;
	}
	
}

class Z extends Y
{
	int c;
	Z()
	{
		System.out.println("I,m class z constructor");
	}
	void setC(int i)
	{
		c=i;
	}
	
	
	void solve()
	{
		int result=a*b*c;
		System.out.println("The answer is:- "+result);
	}
	
	
	
	
	
	
	
}


























public class Multilevel_inherittence {

	public static void main(String[] args) {
		
//		x X=new x();
//		Y y=new Y();
		Z z=new Z();
		
		z.setA(2);
		z.setB(3);
		z.setC(4);
		z.solve();
		
		

	}

}
