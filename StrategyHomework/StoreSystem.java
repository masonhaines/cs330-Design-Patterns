public class StoreSystem extends SnowConeBusiness{
    
    void createOrderNumber()
    {
        if(orderNum >= 99) orderNum = 0;
        orderNum += 1;
    }

    void orderNumber()
    {
        createOrderNumber();
        System.out.println("Creating new order number.... : ");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Current Order Number: " + orderNum);
    }

    boolean paymentType()
    {
        System.out.println("-Cash or Card-");

        System.out.println("Enter 1 for cash");
        System.out.println("Enter 2 for card");

        int choice = cin.nextInt();

        if (choice == 1) {
            System.out.println("You selected cash.");
            return true; // Return true for cash
        } else if (choice == 2) {
            System.out.println("You selected card.");
            return false; // Return false for card
        } else {
            System.out.println("Invalid Input, try again");
            return paymentType();
        }
    }
    
}
