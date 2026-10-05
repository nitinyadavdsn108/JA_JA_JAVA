public class q3 {
    public static void main(String[] args) {
        // 75367943
        // no of minutes
        // 1 hr = 60 min
        // 24 hr or 1 day = 24*60
        //

        double duration = 75367943;
        double days = duration / (24 * 60);
        double years = days / 365;
        System.out.println("In days it is :" + days);
        System.out.println("In years it is :" + years);
    }
}
