import java.util.Scanner;

public interface PaymentInterface {
    
    public void processPayment(PaymentInformation cost, Scanner cin, Stores stores); // is implicitly abstract!
 
}
