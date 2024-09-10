public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck Mallard = new MallardDuck();
        Mallard.performQuack();
        Mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}