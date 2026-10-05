// runtime pollymorphism
class Animal {
    void sound() {
        System.out.println("lord animal");
    }

}

class parrot extends Animal {
    void sound() {
        System.out.println("pee-co-pee-co");
    }
}

class horse extends Animal {
    void sound() {
        System.out.println("hneee-hneee");
    }
}

public class q4 {
    /*
     * Runtime polymorphism is a feature of Java in which an overridden method is
     * resolved and invoked dynamically at runtime based on the actual object,
     * rather than the reference type.
     */
    public static void main(String[] args) {
        parrot p = new parrot();
        horse h = new horse();
        p.sound();
        h.sound();
    }
}
