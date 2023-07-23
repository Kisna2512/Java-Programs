import java.util.Scanner;

class Student {
    int roll_no;
    String Name;

    public Student(int roll_no, String Name) {
        this.Name = Name;
        this.roll_no = roll_no;
    }

    // Function Overloading
    public void display(int roll_no) {
        System.out.println(roll_no);
    }

    // Function Overloading
    public void display(String Name) {
        System.out.println(Name);
    }

    // Function Overloading
    public void display() {
        System.out.println("Name: " + Name + " Roll No.: " + roll_no);
    }

}

class Pen {
    String color;
    String type;

    // non parametarized type
    public Pen() {
        System.out.println("COnstructor Invoked!!");
    }

    // Parametarized Constructor
    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // Copy Constructor
    public Pen(Pen p1) {
        this.color = p1.color;
        this.type = p1.type;
    }

    public void write() {
        System.out.println("Pen Colour and Type: " + color + " " + type);
        System.out.println("Writing Something!!");
    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class ClassesandObjects {
    public static void main(String[] args) {
        // Student[] st = new Student[3];
        // st[0] = new Student(1, "Krishna");
        // st[1] = new Student(2, "Kartik");
        // st[2] = new Student(3, "Yash");
        // for (Student student : st) {
        // student.display();
        // }
        // Pen p = new Pen();
        // p.color = "Blue";
        // p.type = "Ball";
        // Pen p2 = new Pen(p);
        // p2.printColor();

        Student s = new Student(13, "Krishna");
        s.display();
        s.display("Krishna");
        s.display(13);

    }
}