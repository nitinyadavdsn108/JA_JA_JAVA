public class Anagram{

    public boolean isAnagram(String s, String t) {

        int[] dp = new int[s.length()];
        if(s.length() != t.length()){
            return false;
        }
                // shouldi use dp here
                for(int i=0 ; i < s.length() ; i++){
                    dp[i] = 1;
                    int j = i-1;
                    while(j>=0 &&   ){
                        dp[i] = Math.max(dp[i] , dp[j]+1);
                        j--;
                    }
        
                }
        
                
            }


            public static void main(String[] args) {
                
            }
}