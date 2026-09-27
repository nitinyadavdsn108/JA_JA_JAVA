public class q6 {
    public static void main(String[] args) {

        // anonymous class implemetation of interface
        Greeting g = new Greeting(){
        @Override
        public void sayHello(String name){
        System.out.println("hello hope you are well..."+name);
        }
        };

        g.sayHello("bruce wayne");

        // lamba expression implementation
        Greeting g1 = (name) -> System.out.println("good morning .."+name);
        g1.sayHello("thomas wayne");


        

        // Greeting2 g1 = (name1,name2)-> System.out.println("nice to meet you.."+name1+" how is your friend.."+name2);
        // g1.sayHello("harikrishana","rajaram Mohan");

    }
}

interface Greeting {
    void sayHello(String name);
}

interface Greeting2 {
    void sayHello(String name1, String name2);
}
