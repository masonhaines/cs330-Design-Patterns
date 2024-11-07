public class Customer { // Client driver
    
    public static void main (String [] args) {

        System.out.println();
        Waitress createOrder = new Waitress(); // Instantiate invoker
        ShortOrderCook cook = new ShortOrderCook(); // Instantiate reciever
        MakeBurger burger = new MakeBurger(cook);
        MakeShake shake = new MakeShake(cook);

        createOrder.takeOrder(burger);
        createOrder.OrderUp();
        createOrder.takeOrder(shake);
        createOrder.OrderUp();
        
    }

}
