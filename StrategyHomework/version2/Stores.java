import java.util.Scanner;

public abstract class Stores {

    Scanner cin = new Scanner(System.in);
    int orderNum = 70; // random number for initialization

    // objects 
    PaymentInformation paymentInformation;
    PaymentInterface paymentInterface;

    abstract void orderNumber(); 

    public void setPaymentInterface(PaymentInterface paymentInterface, PaymentInformation paymentInformation, Scanner cin) {
        // set 
        this.paymentInterface = paymentInterface;
        this.paymentInformation = paymentInformation;
        
        // Process Payment card or cash from interface
        paymentInterface.processPayment(paymentInformation, cin, this);
        System.out.println();
    }
}
