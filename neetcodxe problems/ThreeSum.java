import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
        
        // first let us find all combinations of 3 that satisfys
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target)
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
            }
        }

        System.out.println(list);
    }
}
