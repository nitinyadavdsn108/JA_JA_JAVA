public class minimumSwaps {
    class Solution {
        public int minimumSwaps(int[] nums) {
            int l = 0;
            int r = nums.length - 1;
            int count = 0;

            while (l < r) {

                if (nums[l] == 0) {

                    while (r > l && nums[r] == 0) {
                        r--;
                    }

                    if (r > l) {
                        int temp = nums[l];
                        nums[l] = nums[r];
                        nums[r] = temp;

                        count++;
                        r--;
                    }
                }

                l++;
            }

            return count;
        }
    }
}
