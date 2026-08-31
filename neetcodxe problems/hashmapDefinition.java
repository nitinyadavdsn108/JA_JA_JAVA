import java.util.HashMap;

public class hashmapDefinition{
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] nums = {2,2,6,6,6,4,5,9,9};

        for(int num : nums){
            if(map.containsKey(num)){

                // it already exist
                map.put(num,map.get(num)+1);

            }else{
                // first time seeing it
                map.put(num,1);
            }
        }

        System.out.println(map);
        
    }
}