public class q1 {

    public static void main(String[] args) {
     
        Circle c1 = new Circle(6);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        Rectangle r1 = new Rectangle(5,6);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }
    
 
}



interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

