public class reverseInteger {

    class Solution {
        public int reverse(int x) {
            // check if x is negative
            boolean isNeg = false;
            if (x < 0) {
                isNeg = true;
                x = Math.abs(x);
            }

            // now do the reversing part
            int temp = x;
            int sum = 0;
            int dig = 0;
            while (temp != 0) {
                dig = temp % 10;
                if (sum * 10 > Integer.MAX_VALUE) {
                    return 0;
                }
                sum = sum * 10 + dig;
                temp = temp / 10;
            }

            // sum will contain the reversed part of x
            if (isNeg) {
                return -sum;
            } else {
                return sum;
            }
        }
    }
}
