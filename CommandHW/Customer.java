public class Customer { // Client 
    
    ShortOrderCook cook;

    public Customer(ShortOrderCook cook)
    {
        this.cook = cook;
    }

    // Client is responsible for making the command object
    // The client calls setCommand() on an invoker object and passes it the command object 
    public void OrderBurger(Waitress waitress)
    {
        MakeBurger burger = new MakeBurger(cook); // instantiate new command/order object burger
        waitress.SetCommand(burger); // Pass invoker command object 
    }

    public void OrderShake(Waitress waitress)
    {
        MakeShake shake = new MakeShake(cook); // instantiate new command/order object Shake 
        waitress.SetCommand(shake); // Pass invoker command object 
    }

    // version takes this step out of client and moves to driver
    // Client is responsible for making the command object
    // public Order getOrderBurger()
    // {
    //     return new MakeBurger(cook);
    // }

    // public Order getOrderShake()
    // {
    //     return new MakeShake(cook);
    // }

}
