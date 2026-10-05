import java.util.Arrays;
import java.util.Scanner;

public class onlineMannerSort {

    static int top = -1;
    // dont allocate 2 billions integers one array it gives outOfMemory error
    // static char[] stack = new char[Integer.MAX_VALUE];
    static int[] stack = new int[1000];

    static void push(int element) {
        if (top == stack.length) {
            System.out.println("stack overflow has occured");
            return;
        }
        top = top + 1;
        stack[top] = element;

    }

    static void peek() {
        if (top == -1) {
            System.out.println("stack is empty, no element inside");
            return;
        }
        System.out.println(stack[top]);
    }

    static int pop() {
        if (top == -1) {
            System.out.println("stack is empty, no element inside");
            return -1;
        }

        return stack[top--];
    }

    static boolean isEmpty() {
        if (top == -1) {

            return true;
        }

        return false;
    }

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

    static int[] sortInOrder(int ele, int iterationCount) {
        int[] ans = new int[iterationCount];
        int ind = 0;

        while (!isEmpty() && stack[top] < ele) {
            ans[ind++] = pop();
        }

        ans[ind++] = ele;

        while (!isEmpty()) {
            ans[ind++] = pop();
        }

        for (int i = ans.length - 1; i >= 0; i--) {
            push(ans[i]);
        }

        return ans;
    }

}