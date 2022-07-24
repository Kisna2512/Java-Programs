package java_DSA;


interface a{
	 void fun1();
}

interface b{
	 void fun2();
}


public class Multiple_inheritence implements a,b {
	public void fun1()
	{
		System.out.println("Im in function 1");
	}
	
	public void fun2()
	{
		System.out.println("I'm in function 2");
	}
	public static void main(String[] args) {
		Multiple_inheritence g=new Multiple_inheritence();
     g.fun1();
     g.fun2();

	}

}
