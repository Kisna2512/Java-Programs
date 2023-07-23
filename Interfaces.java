
interface Animal {
    void walk();

}

interface Herbivors {
    void eat();
}

// We have implmented Multiple inheritence
class Horse implements Animal, Herbivors {
    public void walk() {
        System.out.println("it walks on 4 legs");
    }

    public void eat() {
        System.out.println("Horse eats grass");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}
