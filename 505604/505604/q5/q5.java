public class q5 {
    public static void main(String[] args) {
        //  add is static method in interface calculator
        // add is called directly using calculator.add()
        // opetrate is abstract method in interface calculator
        // operate is implemented using a class Adder

        System.out.println(Calculator.add(90, 10));
        // static method is called using interface name idrectly
        Adder ad = new Adder();
        System.out.println(ad.operate(20, 30));
        //to call the abstract method we used the class object

    }
}

interface Calculator {
    abstract int operate(int a, int b);

    static int add(int a, int b) {
        return a + b;
    }
}

class Adder implements Calculator {
    public int operate(int a, int b) {
        return a + b;
    }
}

