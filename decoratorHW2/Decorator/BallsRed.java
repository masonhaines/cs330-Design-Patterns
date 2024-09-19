public class BallsRed extends TreeDecorator{

    public BallsRed(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "BallsRed, ";
    }

    public float cost() {
        return 1.00f + tree.cost();
    }
}
