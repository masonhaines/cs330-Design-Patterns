public class Customer { // Client 
    
    public static void main (String [] args) {
        Waitress takeOrder = new Waitress(); // Instantiate invoker
        ShortOrderCook cook = new ShortOrderCook(); // Instantiate reciever
        MakeBurger burger = new MakeBurger(cook);
        MakeShake shake = new MakeShake(cook);

        takeOrder.setCommand(burger);
        takeOrder.setCommand(shake);
    }

}
