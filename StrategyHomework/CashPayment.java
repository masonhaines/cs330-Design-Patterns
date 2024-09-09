public class CashPayment {

    float amountPaid;
    float change;

    public float getChange(float totalCost, float amountPaid)
    {   if(amountPaid < totalCost) 
        {
            System.out.println("Amount paid is less than total due. ");
            return -1;
        }
        change = amountPaid - totalCost;
        // Rounds to nearest whole number, 100 times for 2 decimal places->round->divided back to decimal
        change = Math.round(change * 100.0f) / 100.0f; 
        System.out.println("Change: $" + change);
        System.out.println();
        return change;
    }

    float getAmountPaid(float amount) 
    {
        if (amount <= 0) {
            System.out.print("Amount paid must be greater than zero.");
            return -1f;
        }

        this.amountPaid = amount;
        return amount;
    }
}
