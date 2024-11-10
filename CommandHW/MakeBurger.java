public class MakeBurger implements Order/*Command*/{

    ShortOrderCook cook;

    public MakeBurger(ShortOrderCook receiver) // Action
    {
        System.out.println("Adding a burger to your order! ");
        this.cook = receiver;
    }

    @Override
    public void execute()
    {
        cook.makeBurger();
        // System.out.println("test inside of make burger, inside of execute that is executing receiver method make burger"); // For testing, comment out if good to push :)
    }

}
