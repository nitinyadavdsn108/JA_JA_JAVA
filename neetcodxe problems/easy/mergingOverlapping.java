import java.util.Arrays;

public class mergingOverlapping {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3 },
                { 2, 4 },
                { 2, 5 },
                { 3, 5 },
                { 4, 7 },
                { 5, 6 },
                { 6, 9 },
                { 7, 10 },
                { 9, 11 },
                { 12, 17 }
        };

        // intially let res array keep first interval
        int[][] res = new int[arr.length][];
        res[0] = arr[0];
        int k = 0;
        int start = arr[0][0];
        int end = arr[0][1];
        int lapCount = 0;

        for (int i = 1; i < arr.length; i++) {

            // overlapping interval condition
            if (end > arr[i][0]) {
                // extend the end of interval
                end = Math.max(end, arr[i][1]);
                // increment count telling that we found another overlapping interval
                lapCount++;

            } else {
                // save the previous merge interval in res
                res[k++] = new int[] { start, end };

                // update intervals starting nad ending
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        res[k++] = new int[] { start, end };

        System.out.println(lapCount);
        System.out.println(Arrays.deepToString(res));

    }
}