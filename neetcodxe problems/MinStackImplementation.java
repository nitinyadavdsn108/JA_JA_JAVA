class Minstack {

    int top = -1;
    int[] arr;

    Minstack(int size) {
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = val;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        top--;
    }

    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    public int getMin(Minstack m1, int size) {
        // create a temp stack of same size
        Minstack m2 = new Minstack(size);

        for (int i = 0; i < size; i++) {
            int curr = m1.top();
            m1.pop();
            while (m2.top != -1 && m2.top() > curr) {
                m1.push(m2.top());
                m2.pop();
            }
            m2.push(curr);
        }

        while (m2.top != -1) {
            m1.push(m2.top());
            m2.pop();
        }

        return m1.top();
    }
}

public class MinStackImplementation {

    public static void main(String[] args) {

        Minstack st = new Minstack(5);

        st.push(10);
        st.push(20);
        st.push(5);
        st.push(15);

        System.out.println("Top: " + st.top());

        st.pop();

        System.out.println("Top after pop: " + st.top());
    }
}