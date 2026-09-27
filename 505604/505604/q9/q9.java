public class q9 {
    public static void main(String[] args) {
        ConsoleLogger con = new ConsoleLogger();
        con.logInfo("nitin yadav");
        con.logError("nitin yadav");

    }
}


    interface Logger {
       default void logInfo(String msg){
         System.out.println( format(msg));
       }

      default  void logError(String msg){
        System.out.println( format(msg));
      }
       private String format(String msg){
        String res = "|LOG| :"+ msg;
        return res;
    };

    }

class ConsoleLogger implements Logger{

}