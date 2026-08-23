import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        // no of digits will tell which numbers must come in the number
        // like a 4 digit number can have digits 1,2,3,4 and the number can be : 4321,3241,2314,4123 etc
        System.out.println("you must give a valid number as an input :");
         int num = scn.nextInt();
      

     int dig = 0;
     int newnum = 0;
     int i = 1;

     while(num !=0 ){
        dig = num%10;
        num = num/10;
        newnum = newnum + (int) Math.pow(10,dig-1)*i ;
        i++;
     }

     System.out.println("inverse is :"+ newnum);



     
    }
}
