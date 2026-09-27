public class validParentheses {

    public boolean isValid(String s) {
        char[] st = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st[++top] = ch;

            if (top >= 1) {
                if (ch == '}' && st[top - 1] == '{') {
                    top -= 2;
                } else if (ch == ']' && st[top - 1] == '[') {
                    top -= 2;
                } else if (ch == ')' && st[top - 1] == '(') {
                    top -= 2;
                }

            }

        }

        return top == -1;
    }

}
