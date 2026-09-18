public class kokoBananaOptimized {
    public static void main(String[] args) {
        int[] piles = {1,4,3,2};
        int h = 9;
        int maxpile = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if(piles[i] > maxpile){
                maxpile = piles[i];
            }
        }
        int left = 1 ;
        int right = maxpile;
        /* when ( h < maxpile ) , then minimum k val could be maxpile itself */
        int ans = maxpile;

        while(left<=right){
            int mid = (left+right)/2;
            System.out.println(mid);
            /* for this mid speed how many hrs will koko take */
            int totalhrs = 0;
            for (int i = 0; i < piles.length; i++) {
                totalhrs += Math.ceil((double)piles[i]/mid);
                System.out.print(totalhrs+" ");
            }
            /* let us shrink our search space based on totalhrs */
            if(totalhrs<=h){
                /* a valid ans is found but let us save it and look for more lesser k */
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }

        }

        System.out.println(ans);
    }
}
