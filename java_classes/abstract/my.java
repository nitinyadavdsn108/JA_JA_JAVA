class my {
    public static void main(String[] args) {

    }
}

class person {
    String name;
    String age;

    person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name + " ..... " + this.age);
    }

}

class staff extends person {

    String staffId;
    String department;

    staff(String staffId, String department) {
        this.staffId = staffId;
        this.department = department;

    }

    void display() {
        System.out.println(this.staffId + "......" + this.department);
    }

}
