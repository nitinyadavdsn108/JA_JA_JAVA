public class q10 {
    public static void main(String[] args) {
        Payment[] payments = new Payment[2];
        payments[0] = new CreditCardPayment("1234-5678-1234");
        payments[1] = new UPIPayment("nitinyadavdsn@upi");
        payments[0].pay(25000);
        payments[0].receipt();
        payments[1].pay(10000);
        payments[1].receipt();

    }
}

interface Payment{
    void pay(double amount);
    default void receipt(){
        System.out.println("Payment Sccuessful. Receipt generated.");
    }

}

class CreditCardPayment implements Payment{
    String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
     public void pay(double amount){
        System.out.println(amount + " payed by : "+cardNumber);
    }
}

class UPIPayment implements Payment{
    String upiId;
    public UPIPayment(String upiId){
        this.upiId = upiId;
    }
     public void pay(double amount){
        System.out.println(amount+ " payed by : "+upiId);
    }
}