public class Waitress { // Invoker 

    Order slip;

    public Waitress() {}

    public void setCommand(Order order) // take order 
    {
        slip = order;
    }

    public void OrderUp()
    {
        slip.execute();
    }

}