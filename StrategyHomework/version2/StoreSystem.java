public class StoreSystem extends Stores{

    public StoreSystem(){}
    
    void createOrderNumber()
    {
        if(orderNum >= 99) orderNum = 0;
        orderNum += 1;
    }

    @Override
    void orderNumber() // Override from Stores
    {
        createOrderNumber();
        System.out.println("Creating new order number.... : ");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Current Order Number: " + orderNum);
    }
}
