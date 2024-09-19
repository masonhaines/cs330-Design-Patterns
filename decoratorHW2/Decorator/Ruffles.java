public class Ruffles extends TreeDecorator{
    
    public Ruffles(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "Ruffles, ";
    }

    public float cost() {
        return 1.00f + tree.cost();
    }
}
