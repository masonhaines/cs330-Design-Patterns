public class Star extends TreeDecorator{
    
    private static boolean StarAddedDescription;
    private static boolean StarAddedCost;
    
    public Star(Tree tree) {
        StarAddedDescription = false;
        StarAddedCost = false;
        this.tree = tree;
    }

    public String getDescription() {
        if(!StarAddedDescription) 
        {
            StarAddedDescription = true;
            return tree.getDescription() + "Star, ";
        } 
        
        return tree.getDescription();
    }

    public float cost() {

        if(!StarAddedCost) 
        {
            StarAddedCost = true;
            return 4.00f + tree.cost();
        } 
        else if (StarAddedCost && StarAddedDescription) {
            System.out.println("--Tree already has a star! You can only have one star per tree.--");
        }

        return tree.cost();
    }
}
