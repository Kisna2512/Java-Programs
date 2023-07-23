
// Single Level Inheritence
class Shape {
    public void area() {
        System.out.println("Area Of Shape");
    }
}

class Traingle extends Shape {
    public void area(double l, double h) {
        System.out.println("Area is : " + (0.5) * l * h);
    }
}

// Multilevel Hierachical
class EquilateralTraingle extends Traingle {
    public void area(double l, double h) {
        System.out.println("Area is : " + (0.5) * l * h);
    }
}

// Hierachical inheritence
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Traingle t = new Traingle();
        t.area(2.0, 4.0);
    }
}
