public class middleIndex {
    class Solution {
        public int findMiddleIndex(int[] nums) {
            long totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }

            long leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                long rightSum = totalSum - leftSum - nums[i];

                if (leftSum == rightSum) {
                    return i;
                }

                leftSum += nums[i];
            }

            return -1;
        }
    }
}
