public class Ribbons extends TreeDecorator{

    public Ribbons(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "Ribbons, ";
    }

    public float cost() {
        return 2.00f + tree.cost();
    }
    
}
