import java.util.Arrays;

public class Dutch {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 2, 1, 1, 0, 1, 1, 0, 2, 2, 1, 0 };

        dutchFlag(nums);

        System.out.println(Arrays.toString(nums));

    }

    static void dutchFlag(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                int tmp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = tmp;

                left++;
                mid++;
            } else {
                int tmp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = tmp;

                right--;
            }
        }
    }
}
