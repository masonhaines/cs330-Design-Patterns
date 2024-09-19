public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Build Your Own Christmas Tree");
        System.out.println();

        Tree ColoradoTree = new ColoradoBlueSpruce(); // 20
        ColoradoTree = new Star(ColoradoTree); // 0
        ColoradoTree = new Ruffles(ColoradoTree); // 1
        ColoradoTree = new Star(ColoradoTree); // 4
        ColoradoTree = new Ruffles(ColoradoTree); // 1
        ColoradoTree = new LEDs(ColoradoTree); // 10
        printTree(ColoradoTree); // 36

        Tree BalsamTree = new BalsamFir();
        BalsamTree = new LEDs(BalsamTree);
        BalsamTree = new BallsBlue(BalsamTree);
        BalsamTree = new Star(BalsamTree);
        BalsamTree = new Ruffles(BalsamTree);
        printTree(BalsamTree);

        Tree DouglasTree = new DouglasFir();
        DouglasTree = new LEDs(DouglasTree);
        DouglasTree = new Star(DouglasTree);
        DouglasTree = new BallsBlue(DouglasTree);
        DouglasTree = new Ruffles(DouglasTree);
        DouglasTree = new BallsBlue(DouglasTree);
        DouglasTree = new BallsSilver(DouglasTree);
        DouglasTree = new Star(DouglasTree);
        printTree(DouglasTree);

        Tree FraserTree = new FraserFir();
        FraserTree = new Lights(FraserTree);
        FraserTree = new BallsRed(FraserTree);
        FraserTree = new Star(FraserTree);
        FraserTree = new BallsRed(FraserTree);
        FraserTree = new BallsRed(FraserTree);
        FraserTree = new BallsBlue(FraserTree);
        printTree(FraserTree);

    }

    public static void printTree(Tree tree) {
        System.out.println(tree.getDescription() + "Total Cost: $" + tree.cost());
        System.out.println();
    }
}