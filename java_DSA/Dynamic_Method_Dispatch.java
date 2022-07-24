package java_DSA;



class A {
	 void diplay()
	{
		System.out.println("The class A function");
	}
}

class B extends A{
	 void display()
	{
		System.out.println("The class B function");
	}
}












public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		
		A b=new B();
		b.diplay();

	}

}
