public class Waitress { // Invoker 

    Order orderSlip; // command object
    MakeBurger burger;
    MakeShake shake;

    public Waitress() {}

    public void takeOrder(Order order) // set command
    {

        orderSlip = order;
        // System.out.println("Test from waitress, from take order method."); // For testing, comment out if good to push :)
    }

    public void OrderUp()
    {   
        System.out.println();
        orderSlip.execute();
        System.out.println("Order Up! ");
    }

}