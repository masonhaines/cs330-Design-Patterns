import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {   
        // Create instances of PaymentInformation, PaymentInterface implementations, system classes
        PaymentInformation paymentInformation = new PaymentInformation();
        PaymentInterface cashPayment = new CashPayment();
        PaymentInterface cardPayment = new CardPayment();
        KioskSystem kioskSystem = new KioskSystem();
        StoreSystem storeSystem = new StoreSystem();

        Scanner cin = new Scanner(System.in);

        // Set the payment interface for the kiosk system to use cash payments
        System.out.println("-------------Kiosk-------------");
        System.out.println();
        kioskSystem.setPaymentInterface(cashPayment, paymentInformation, cin); // Can only use card
        // Set the payment interface for the store system to use card payments
        System.out.println("-------------Store-------------");
        System.out.println();
        storeSystem.setPaymentInterface(cardPayment, paymentInformation, cin); // Use cash or card
        System.out.println("-------------Store-------------");
        System.out.println();
        storeSystem.setPaymentInterface(cardPayment, paymentInformation, cin); // Use cash or card
    }
}
