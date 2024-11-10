public class Waitress { // Invoker 

    Order orderSlip; // command object

    public Waitress() {}

    public void SetCommand(Order order) // set command Take Order
    {
        orderSlip = order;
        // System.out.println("Test from waitress, from take order method."); // For testing, comment out if good to push :)
    }

    public void OrderUpExecution()
    {   
        orderSlip.execute();
        System.out.println("Order Up! ");
        System.out.println();
    }

}