package java_DSA;



class l extends Object{
	public String toString()
	{
		return "A";
	}
}

class M extends l{
	public String toString()
	{
		return "B";
	}
}

class N extends M{
	public String toString()
	{
		return "c";
	}
}










public class Polymorphism {

	
	
	public static void fun(Object x)
	{
		System.out.println(x.toString());
	}
	
	
	
	
	public static void main(String[] args) {
		 
		fun(new l());
		fun(new N());
		fun(new M());

	}

}
