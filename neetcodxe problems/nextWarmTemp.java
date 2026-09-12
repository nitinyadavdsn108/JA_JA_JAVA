public class nextWarmTemp {

    public static void main(String[] args) {
        int[] temp = { 12, 45, 24, 26, 11, 30 };
        Solution s = new Solution();
        int[] res = s.dailyTemperatures2(temp);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            boolean isHigher = false;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[j] > temp[i]) {
                    isHigher = true;
                    res[i] = j - i;
                    break;
                }
            }

            if (!isHigher) {
                res[i] = 0;
            }
        }

        return res;
    }

    public int[] dailyTemperatures2(int[] nums) {
        int[] res = new int[nums.length];
        int[] st = new int[nums.length];
        int top = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (top == -1) {
                st[++top] = i;
                res[i] = 0;
            }
            if (nums[st[top]] <= nums[i]){

                while (top >= 0 && nums[st[top]] <= nums[i]) {
                    top--;
                }
                st[++top] = i;
                if (top == 0) {
                    res[i] = 0;
    
                } else {
                    res[i] = st[top-1] - i;
                }
            }
            if (nums[st[top]] > nums[i]) {
                res[i] = st[top] - i;
                st[++top] = i;
            }

        }

        return res;
    }
}
