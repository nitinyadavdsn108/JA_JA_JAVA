
public class q1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("nitin");
        Employee e2 = new Employee("cassey");
        System.out.println(e1.name + " " + e1.id);
        System.out.println(e2.name + " " + e2.id);

    }
}

class Employee {
    String name;
    int id;

    static int sharedId = 1;

    Employee(String name) {
        this.id = sharedId;
        this.name = name;
        sharedId = sharedId + 1;
    }

}
