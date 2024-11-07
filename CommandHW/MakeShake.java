public class MakeShake implements Order{
    ShortOrderCook cook;

    public MakeShake(ShortOrderCook cook)
    {
        this.cook = cook;
    }

    @Override
    public void execute()
    {
        cook.makeBurger();
    }
}
