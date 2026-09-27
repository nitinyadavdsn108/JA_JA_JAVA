public class q8 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student s1 = new Student("martin", 54);
        Student s2 = new Student("truce", 52);
        Student s3 = new Student("falcon", 36);
        Student s4 = new Student("ralph", 46);
        Student s5 = new Student("ben", 40);
        students[0] = s1;
        students[1] = s5;
        students[2] = s2;
        students[3] = s3;
        students[4] = s4;

        for (Student s : students) {
            System.out.println(s.name + ": " + s.marks);
        }

    }
}



class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


interface comparable{
    
}

