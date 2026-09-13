import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0 ; i<nums.length ; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<=right){
                int sum = nums[left]+nums[right]+nums[i];

                if(sum < target){
                    left++;
                }else if(sum > target){
                    right--;
                }else{
                    if(!list.contains(Arrays.asList(nums[i],nums[left],nums[right]))){
                        list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    }
                }
                left++;
                right--;
            }
        
        }
    
    
    System.out.println(list);
    
    }
}
