import java.util.Arrays;
import java.util.Scanner;

class onlineMannerSortPartII {

    /* i will do this problem using bst */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = 1;
        int iterationCount = 0;
        while (start == 1) {

            System.out.println("enter an Integer value");
            int ele = scn.nextInt();
            iterationCount++;
            int[] newSeq = sortInOrder(ele, iterationCount);
            System.out.println("inserting new element at right position we get array");
            System.out.println(Arrays.toString(newSeq));

            System.out.println("want to continue enter 1 to contine ,or press any number to exit");
            start = scn.nextInt();

        }

    }

    static int[] sortInOrder(int ele, int it) {
        int[] ans = new int[it];

        return ans;
    }

}