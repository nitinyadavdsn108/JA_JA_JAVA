public class q5 {

    public static void main(String[] args) {
        Parent c = new Child();
        c.show();

        // \\ /* cannot instantiate abstract class directly here. */ animal a = new
        // animal();
        animal a = new dog();
        a.sound();

    }

}

abstract class animal {
    abstract void sound();

}

class dog extends animal {
    void sound() {
        System.out.println("bark");
    }

}

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");

    }
}
