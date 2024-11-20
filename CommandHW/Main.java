public class Main { 
    
    public static void main (String [] args) {

        System.out.println();
        Waitress createOrder = new Waitress(); // Instantiate invoker
        ShortOrderCook cook = new ShortOrderCook(); // Instantiate receiver
        Customer customer = new Customer(cook); // Instantiate client

        // version takes this step out of client and moves to driver
        // Step: The client calls setCommand() on an invoker object and passes it the command object 
        createOrder.SetCommand(customer.getOrderBurger());
        createOrder.OrderUpExecution();
        createOrder.SetCommand(customer.getOrderShake());
        createOrder.OrderUpExecution();

        // customer.OrderBurger(createOrder);
        // createOrder.OrderUpExecution();
        // customer.OrderShake(createOrder);
        // createOrder.OrderUpExecution();

    }
}
