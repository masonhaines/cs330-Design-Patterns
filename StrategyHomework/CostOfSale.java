public class CostOfSale {
    public float cost;

    // public CostOfSale(float cost)
    // {
    //     if (cost <= 0) {
    //         System.out.println("cost of sale must be greater than zero.");
    //     }
    //     this.cost = cost;
    // }

    float getCostOfSale(float cost)
    {
        if (cost <= 0) {
            System.out.print("Cost of sale must be greater than zero.");
            return -1f;
        }

        this.cost = cost;
        return cost;
    }

    void displayCostOfSale()
    {
        System.out.print("Purchase Total: $");
    }
}
