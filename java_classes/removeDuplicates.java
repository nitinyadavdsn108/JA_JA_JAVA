import java.util.Arrays;
import java.util.Scanner;

class removeDuplicates {

    public static void remove(int[] nums) {
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] nums = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));

    }
}