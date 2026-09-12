public class nextWarmTemp{
    
    public static void main(String[] args) {
       int[] temp = {12,45,24,26,11,30}; 
       Solution s = new Solution();
       int[] res = s.dailyTemperatures(temp);
       for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
       }
    }
} 

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
      
        for(int i=0;i<temp.length;i++){
              boolean isHigher = false;
            for(int j=i+1;j<temp.length;j++){
                if(temp[j]>temp[i]){
                   isHigher = true;
                   res[i] = j-i;
                   break;
                }
            }

            if(!isHigher){
                res[i] = 0;
            }
        }


        return res;
    }
}
