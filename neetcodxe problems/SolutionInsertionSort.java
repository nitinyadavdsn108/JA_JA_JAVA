import java.util.ArrayList;
import java.util.List;

public class SolutionInsertionSort {

    public static List<List<Pair>> insertionSort(List<Pair> pairs) {
   
       List<List<Pair>> result = new ArrayList<>();

       

       for(int i = 0 ; i < pairs.size() ; i++){ 
        int j = i -1;
        Pair curr = pairs.get(i);
        while(j>=0 && pairs.get(j).key > curr.key){
            pairs.set(j+1, pairs.get(j));
            j--;
        } 
        pairs.set(j+1,curr);
        result.add(new ArrayList<>(pairs));
    }

    return result;
   
   }
   
   public static void main(String[] args) {
    
    List<Pair> list = new ArrayList<>();
    Pair p = new Pair(1,"uranus");
    Pair p1 = new Pair(3,"aloha");
    Pair p2 = new Pair(2,"csma");
    list.add(p);
    list.add(p1);
    list.add(p2);
;
    System.out.println(
        insertionSort(list));
   }
   
   
   
   }
   