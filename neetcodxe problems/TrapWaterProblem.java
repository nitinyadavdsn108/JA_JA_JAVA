public class TrapWaterProblem{
    public static int trap(int[] height) {

        //get the leftmost height
        // get the rightmost height
        // find the minmum among them
        // base will be = level - height[i];
        // width = left- right
        int trapped = 0;

        for(int i = 1 ; i < height.length-1 ; i++){
       /*      int left = i-1;
            int right = i+1;

            while(left > 0 && height[left-1] > height[left]){
                left--;
            }

            while(right < height.length-1 && height[right+1] > height[right]){
                right++;
            }
 */

            int left = 0;
            for(int j=0 ; j < i ; j++){
                left = Math.max(left,height[j]);
            }

            int right = 0;
            for(int j =i+1 ; j < height.length ; j++){
                right = Math.max(right , height[j]);
            }


            int minHeight = Math.min(left, right);

            if(minHeight > height[i])
            trapped +=(minHeight-height[i]);


        }
        return trapped;        
    }

    public static void main(String[] args) {
        int[] nums = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(trap(nums));
    }
}