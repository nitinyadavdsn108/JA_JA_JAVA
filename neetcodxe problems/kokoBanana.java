public class kokoBanana {
    public static void main(String[] args) {

        int[] piles = { 25,10,23,4 };
        int h = 4;

        int k = 0; // intially one
        int totalhrs = h + 1;
        int n = piles.length;

        while (totalhrs > h) {
            totalhrs = 0;
            k++;
            for (int i = 0; i < n; i++) {
                totalhrs += Math.ceil((double)piles[i] / k);
                System.out.print(totalhrs + " ");
            }
            System.out.println();
            
        }

        System.out.println(k);
    }
}