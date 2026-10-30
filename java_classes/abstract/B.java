interface intref {
    // every method inside interface is always public and abstract
    public void m1();

    public void m2();
}

abstract class serviceProvider implements intref {

    // it is compulsory to name methods as public
    // provide implementation for all methods of interface
    // or declare class as abstract
    public void m1() {

    }

}

class subServie extends serviceProvider {
    public void m2() {

    }

}