abstract class Animal {
    Animal() {
        System.out.println("Animal...");
    }

    // abstract method
    abstract void walk();

    // non-abstract method
    public void eat() {
        System.out.println("Animal can eat");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse...");
    }

    public void walk() {
        System.out.println("Horse Walks on 4 legs");
    }
}

class Aniket extends Animal {
    public void walk() {
        System.out.println("Aniket walks on 2 legs");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

        Aniket a = new Aniket();
        a.walk();
    }
}
