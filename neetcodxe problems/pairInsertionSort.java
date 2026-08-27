import java.util.ArrayList;

public class pairInsertionSort {
   
    public static void main(String[] args) {
        Pair p = new Pair(1,"carrot");
        Pair p1 = new Pair(5,"mango");
        Pair p2 = new Pair(3,"chewy");
        ArrayList<Pair> pairList = new ArrayList<>();
        pairList.add(p);
        pairList.add(p1);
        pairList.add(p2);


        System.out.println(pairList.toString());
        
    }
}

class Pair{
    int key;
    String value;
    Pair(int key , String value){
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

}