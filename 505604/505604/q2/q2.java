public class q2 {
    public static void main(String[] args) {
        CircleConstants Cir = new CircleConstants();
        System.out.println(Cir.circumference(5.6));

    }
}


interface MathConstants {

    // by default variable in java are public static final
    double PI = 3.14159;
    double E = 2.71828;

}

class CircleConstants implements MathConstants {
    double circumference(double radius) {
        return 2 * PI * radius;
    }
}
