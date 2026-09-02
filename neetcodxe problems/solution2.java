import java.util.Arrays;

public class solution2 {
    static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // cannot go out of creed
        int pro = 1;
        int isZero = 0;
        int isNotZero = 0;

        for (int i : nums) {
            if (i != 0)
                pro *= i;
            isNotZero = 1;
            if (i == 0)
                isZero = 1;
        }

        if (isNotZero == 0) {
            return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && isZero == 1)
                result[i] = 0;
            else if (isZero == 1 && nums[i] == 0) {
                result[i] = pro;
            } else {
                result[i] = pro / nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] result = { 0, 0 };
        System.out.println(Arrays.toString(productExceptSelf(result)));

    }
}
