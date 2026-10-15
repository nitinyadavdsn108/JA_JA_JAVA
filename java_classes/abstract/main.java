
/*
 * abstract class test {
 * public abstract void m1();
 * 
 * public abstract void m2();
 * }
 * 
 * abstract class subtest extends test {
 * public void m1() {
 * 
 * }
 * }
 * 
 * abstract class subsubtest extends test {
 * public void m2() {
 * 
 * }
 * }
 */
// child class are rersponsible to implement methods of abstract classres

abstract class vehicle {

}

class bus extends vehicle {
    public int getnoofwheels() {
        return 8;
    }
}

class auto extends vehicle {
    public int getnoofwheels() {
        return 3;
    }

}

public class main {

    public static void main(String[] args) {
        bus b = new bus();
        System.out.println(b.getnoofwheels());

        auto a = new auto();
        System.out.println(a.getnoofwheels());
    }
}