public class q3 {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.show();

    }
}

interface Printable {
    void print();

}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("method called from Printable interface");
    }

    public void show() {
        System.out.println("method called from Showable inteface");
    }
}
