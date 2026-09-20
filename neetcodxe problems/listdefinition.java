import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listdefinition{
    public static void main(String[] args) {
         List<List<Integer>> triplets =  new ArrayList<>();
        /* triplets.add(Arrays.asList(2,3,5));
        System.out.println(triplets.toString());
       // int[] rr = {2,3,5};
        if(triplets.contains(Arrays.asList(2,3,5))){
            System.out.println("yyes");
        }
 */
        
        int[] a = {-1,0,1,2,-1,-4};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int z = j+1; z < a.length; z++) {
                    if(a[i]+a[j]+a[z] == 0){
                        if(!triplets.contains(Arrays.asList(a[i],a[j],a[z]))){
                            triplets.add(Arrays.asList(a[i],a[j],a[z]));
                        }
                    }
                }
            }
        }

        System.out.println(triplets);
    }
}