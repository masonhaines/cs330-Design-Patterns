public class BallsBlue extends TreeDecorator{
    
    public BallsBlue(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "BallsBlue, ";
    }

    public float cost() {
        return 2.00f + tree.cost();
    }
}
