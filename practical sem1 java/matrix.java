public class matrix {

    public static void main(String[] args) {
        int mat[][] = new int[3][3];

        mat = new int[][] {
                { 1, 2, 3 },
                { 11, 12, 13 },
                { 6, 5, 4 }
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    leftSum += mat[i][j];
                }
                if (i == 3 - j - 1) {
                    rightSum += mat[i][j];
                }

            }
        }

        System.out.println("left diagonal sum : " + leftSum);
        System.out.println("right diagonal sum : " + rightSum);

        int maxSum = 0;
        int currSum;
        for (int i = 0; i < 3; i++) {
            currSum = 0;

            for (int j = 0; j < 3; j++) {
                currSum += mat[i][j];
            }

            System.out.println("current sum of elements is : " + currSum);

            if (currSum > maxSum) {
                maxSum = currSum;
            }

        }

        System.out.println("maximum sum of elements is : " + maxSum);

        /* print transpose of matrix */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
