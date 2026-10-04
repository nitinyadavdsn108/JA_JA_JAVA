public class stackPalindrome {
    static int top = -1;
    // dont allocate 2 billions integers one array it gives outOfMemory error
    // static char[] stack = new char[Integer.MAX_VALUE];
    static char[] stack = new char[1000];

    static void push(char element) {
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

    static char pop() {
        if (top == -1) {
            System.out.println("stack is empty, no element inside");
            return 'q';
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
        String s = "nitin";

        // apply check to find palindrome
        // traverse the string and push each element into the stack
        // traverse the string and pop one element fron srack and compare them
        // if each popped character and string characters comes same
        // then it is a plaindrome

        System.out.println(checkPalindrome(s));

    }

    static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {

            push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != pop()) {
                return false;
            }
        }

        return true;

    }

}
