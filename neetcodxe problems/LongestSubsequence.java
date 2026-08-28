public class LongestSubsequence {
    
    public static void main(String[] args) {
          // we have to work on nums array
          int[] nums = new int[]{10,2,7,11,3,44};
          System.out.println(lengthOfLIS(nums));

               
    }

    public static int lengthOfLIS(int[] nums) {
        // we have to work on nums array
        int[] curr = new int[nums.length];
        int[] result = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int k = 0;
            curr[k] = nums[i];
            k++;
            int j = i+1;
            while(j<nums.length){

            if(curr[k-1] < nums[j]){
                    curr[k] = nums[j];
                    k++;
            }
            j++;

            }

            if(result.length == 0 || result.length < k ){
                result = curr;
            }
        }
        return result.length;
    }
    
    
}
