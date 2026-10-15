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
