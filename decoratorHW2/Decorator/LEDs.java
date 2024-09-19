public class LEDs extends TreeDecorator{

    public LEDs(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "L.E.D's, ";
    }

    public float cost() {
        return 10.00f + tree.cost();
    }
    
}
