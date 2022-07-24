package Maths_DSA;


class A{
	int x=10;
	A()
	{
		System.out.println("I'm Krishna");
	}
	
	void fun()
	{
		System.out.println("Im function of class A");
	}
}

class B extends A{
	B()
	{
		super();
		System.out.println("I'm Yash");
	}
	void display()
	{
        super.fun();
		System.out.println(super.x);
	}
}








public class Super_Concept {

	public static void main(String[] args) {
//		A a=new A();
       B b=new B();
       b.display();

	}

}
