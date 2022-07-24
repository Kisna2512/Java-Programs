package Maths_DSA;



class Myclass{
	
	String name;
	int roll_no;
	float percentage;
	
	
	public void display(String name,int roll_no,float percentage)
	{
		System.out.println("Student Data Name:- "+name+" ");
		System.out.println("The name of student is: "+name);
		System.out.println("The roll no of student is:- "+roll_no);
		System.out.println("The percentage of student is: "+percentage);
	}
	
	
	
	
	
}

















public class String_Handling {

	public static void main(String[] args) {
      Myclass obj=new Myclass();
      obj.display("krishna Gajanan kotgire", 69, (float) 96.57);

	}

}
