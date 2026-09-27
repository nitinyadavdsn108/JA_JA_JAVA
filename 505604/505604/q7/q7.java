public class q7 {
    public static void main(String[] args) {
          
        Myclass m = new Myclass();
        m.methodA();
        m.methodB();

        A a = new Myclass();
        a.methodA();
        // a.methodB(); cannot acces methodB from a refrence type A

        // from a refrence type B we can access both methodA() and methodB()
        B b = new Myclass();
        b.methodA();
        b.methodB();
    }
}



interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class Myclass implements B {

    // since this class implements B then it have to by default implements methods
    // of A
    @Override
    public void methodA() {
        System.out.println("method A called ");
    }

    @Override
    public void methodB() {
        System.out.println("method B called ");
    }
}


