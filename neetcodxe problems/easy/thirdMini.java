// [7, 2, 9, 4, 1, 8, 3, 6, 5]
public class thirdMini {

    public static void main(String[] args) {
        int[] a = new int[] { 7, 2, 9 };
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        // find third , second minimum in this array
        for (int i = 0; i < a.length; i++) {

            if (a[i] < first) {
                third = second; // second minimum becomes third minimum
                second = first; // first minimum becomes second minimum
                first = a[i]; // the least becomes first minimum
            }
            // a[i] is not less then first then let us check if it is less then second
            else if (a[i] < second) {
                third = second; // second minimum becomes third minimum
                second = a[i]; // got new second minimum
            }
            // a[i] is not less then second,first then let us check if this is lesss then
            // third
            else if (a[i] < third) {
                third = a[i]; // got third minimum
            }

        }

        System.out.println(first + " , " + second + " , " + third);

    }
}