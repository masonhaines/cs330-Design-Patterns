// import java.util.Random;
import java.util.Scanner;

public abstract class SnowConeBusiness {

    public CashPayment cash;
    public AmountPaid paid = new AmountPaid();
    public CostOfSale costOfSale = new CostOfSale();

    Scanner cin = new Scanner(System.in);

    abstract void orderNumber();

    // Get cost of sale from user
    boolean getCostOfSale() {
        // System.out.print("Purchase Total: $");
        // costOfSale = new CostOfSale(cin.nextFloat());

        costOfSale.displayCostOfSale();
        if(costOfSale.getCostOfSale(cin.nextFloat()) == -1)
        {
            System.out.println();
            return false;
        }

        System.out.println();
        return true;
    }

    // Get amount paid from user
    boolean getAmountPaid() {
        // System.out.print("Amount paid by customer: $");
        // paid = new AmountPaid(cin.nextFloat());

        paid.displayAmountPaid();
        if(paid.getAmountPaid(cin.nextFloat()) == -1)
        {
            System.out.println();
            return false;
        }
        
        System.out.println();
        return true;
    }

    boolean getChange() // is used for both use class
    {   
        if(cash.getChange(costOfSale.cost , paid.amount) == -1)
        {
            return false;
        }
        // cash.displayChange();
        return true;
    }
}
