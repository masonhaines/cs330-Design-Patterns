public class MakeShake implements Order /*Command*/{

    ShortOrderCook cook;

    public MakeShake(ShortOrderCook receiver) // Action
    {
        System.out.println("Adding a shake to your order! ");
        this.cook = receiver;
    }

    @Override
    public void execute()
    {
        cook.makeShake();
        // System.out.println("test inside of make shake, inside of execute that is executing receiver method make shake"); // For testing, comment out if good to push :)
    }
}
