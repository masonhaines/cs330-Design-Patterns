public class BallsSilver extends TreeDecorator{
    
    public BallsSilver(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "BallsSilver, ";
    }

    public float cost() {
        return 3.00f + tree.cost();
    }
}