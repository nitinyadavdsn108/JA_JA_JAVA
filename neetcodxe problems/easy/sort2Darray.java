import java.util.Arrays;

public class sort2Darray {

    public static void main(String[] args) {
        // create a 2d array
        int[][] arr = {
                { 5, 100 },
                { 2, 200 },
                { 8, 300 },
                { 1, 400 },
        };


    // this is o(n^2) comp solution
    // basically sorting every row in ascending order 
    // order in which first element of each row appears should be ascending

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }

        System.out.println(Arrays.deepToString(arr));
    }

}
