import java.util.Scanner;

public abstract class SnowConeBusiness {

    public CashPayment cash;
    public CardPayment card;
    public CostOfSale costOfSale = new CostOfSale();

    int orderNum = 70; // random number for initialization

    Scanner cin = new Scanner(System.in);

    abstract void orderNumber(); 

    // Get cost of sale from user
    boolean getCostOfSale() {
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

        System.out.print("Amount paid by customer: $" );
        if(cash.getAmountPaid(cin.nextFloat()) == -1)
        {
            System.out.println();
            return false;
        }
        
        return true;
    }

    boolean getChange() // is used for both classes
    {   
        if(cash.getChange(costOfSale.cost , cash.amountPaid) == -1)
        {
            return false;
        }
        return true;
    }
    
    boolean getCardNumber()
    {
        System.out.print("Please Enter a 4 digit Card Number: ");
        if(card.getCardNumber(cin.nextLong()) == -1)
        {
            return false;
        }

        System.out.println("Amount paid by customer: $" + costOfSale.cost);
        System.out.println();
        return true;
    }
}
