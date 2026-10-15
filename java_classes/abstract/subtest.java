abstract class newtest {
    // partiallly implemented class
    // abstract class cannot be instansiated

    public abstract void m1();

    public static void main(String[] args) {

        t t1 = new t();
        t1.m1();
    }
}

class t extends newtest {

    public void m1() {
        System.out.println("implememtned");
    }

}

// even though class dosent contain any abstract method we can ddeclare it as
// abstract class
// we declare those class as abstract in which have dummy methods to avoid
// object
// creation

abstract class box {

    void box1() {
    }

    void box2() {
    }

    // abstract class contain zero no of abstract merthod also
}

abstract class test {
    public abstract void m1();

    public abstract void m2();
}

// child class is responsible for implementation of abstract class
// for every abstract method

public class subtest extends test {
    public void m1() {

    }

    public void m2() {

    }

}