public class MakeBurger implements Order{
    ShortOrderCook cook;

    public MakeBurger(ShortOrderCook cook)
    {
        this.cook = cook;
    }

    @Override
    public void execute()
    {
        cook.makeBurger();
    }

}
