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

    // by default case is passing an empty List
    
    System.out.println(
        insertionSort(list));
   }
   
   
   
   }
   