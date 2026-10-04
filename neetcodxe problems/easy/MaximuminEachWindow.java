import java.util.Arrays;

public class MaximuminEachWindow {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };
        /*
         * arr = [1, 3, -1, -3, 5, 3, 6, 7]
         * k = 3
         */

        int k = 3;

        findMaximumEachWindow(k, arr);
        findMinimumEachWindow(k, arr);

    }

    static int findMinimum(int start, int end, int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMaximum(int start, int end, int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static void findMaximumEachWindow(int k, int[] arr) {
        int start = 0;
        int end = 0;
        int ind = 0;
        int[] ans = new int[arr.length - k + 1];

        // make the first window
        while (end < k - 1)
            end++;

        while (end < arr.length) {
            ans[ind++] = findMaximum(start, end, arr);
            start++;
            end++;
        }

        System.out.println(Arrays.toString(ans));

    }

    static void findMinimumEachWindow(int k, int[] arr) {
        int start = 0;
        int end = 0;
        int ind = 0;
        int[] ans = new int[arr.length - k + 1];

        // make the first window
        while (end < k - 1)
            end++;

        while (end < arr.length) {
            ans[ind++] = findMinimum(start, end, arr);
            start++;
            end++;
        }

        System.out.println(Arrays.toString(ans));

    }

}
