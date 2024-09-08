public class AmountPaid {
    public float amount;

    // public AmountPaid(float amount) {
    //     if (amount <= 0) {
    //         System.out.println("Amount paid must be greater than zero.");
    //         this.amount = -1;
    //     }
    //     this.amount = amount;
    // }

    float getAmountPaid(float amount) 
    {
        if (amount <= 0) {
            System.out.print("Amount paid must be greater than zero.");
            return -1f;
        }

        this.amount = amount;
        return amount;
    }

    void displayAmountPaid()
    {
        System.out.print("Amount paid by customer: $" );
    }

}
