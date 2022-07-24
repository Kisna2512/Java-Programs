package Maths_DSA;


class Base{
	int a=10;
	void display(int a)
	{
		this.a=a;
	}
}

class Derived extends Base{
	int b;
	void display(int i)
	{
		super.display(i+5);
		b=20;
		int c=a+b;
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is "+b);
		System.out.println("The value of c is "+c);
		
	}
}












public class Method_Overiding {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.display(10);

	}

}
