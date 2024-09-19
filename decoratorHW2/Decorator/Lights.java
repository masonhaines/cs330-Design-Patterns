public class Lights extends TreeDecorator{

    public Lights(Tree tree) {
        this.tree = tree;
    }

    public String getDescription() {
        return tree.getDescription() + "Lights, ";
    }

    public float cost() {
        return 5.00f + tree.cost();
    }
    
}
