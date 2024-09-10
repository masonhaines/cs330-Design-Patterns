public class KioskSystem extends Stores{

    public KioskSystem(){
        this.paymentInterface = new CashPayment();
    }

    @Override
    void orderNumber() // Override from Stores
    {
        System.out.print("Please Enter Kiosk Order Number: ");
        orderNum = cin.nextInt(); // Use Scanner to read order number
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Current Order Number: " + orderNum);
    }
}
