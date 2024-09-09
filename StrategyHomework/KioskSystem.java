public class KioskSystem extends SnowConeBusiness{

    void orderNumber() // Override from Systems
    {
        System.out.print("Please Enter Kiosk Order Number: ");
        orderNum = cin.nextInt(); // Use Scanner to read order number
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Current Order Number: " + orderNum);
    }
}
