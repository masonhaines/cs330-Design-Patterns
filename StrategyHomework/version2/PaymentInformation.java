import java.util.Scanner;

public class PaymentInformation {
    
    public float cost;
    public float amountPaid;
    public float change;
    Scanner cin = new Scanner(System.in);
   
    public float setCostOfSale(Scanner cin) {
        System.out.print("Enter the total cost of sale: $");
        cost = cin.nextFloat(); // Set to user input
        if (cost <= 0) {
            System.out.println("Cost of sale must be greater than zero.");
            return -1; 
        }
        return cost;
    }
    
    public float setAmountPaid(Scanner cin) {
        System.out.print("Enter the amount paid: $");
        amountPaid = cin.nextFloat(); // Set to user input
        if (amountPaid <= 0) {
            System.out.println("Amount paid must be greater than zero.");
            return -1; 
        }
        return amountPaid;
    }

    float getCost()
    {
        return cost;
    }

    float getAmountPaid()
    {
        return amountPaid;
    }

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

    int paymentType()
    {
        System.out.println("-Cash or Card-");
        System.out.println("Enter 1 for cash");
        System.out.println("Enter 2 for card");
        System.out.print("Payment Type: ");
        
        int choice = cin.nextInt(); // Set to user input
        System.out.println();

        if (choice == 1) {
            System.out.println("You selected cash.");
            return 1; // Return true for cash
        } else if (choice == 2) {
            System.out.println("You selected card.");
            return 2; // Return false for card
        } else {
            System.out.println("Invalid Input, try again");
            return 3;
        }
    }

    void displayCostOfSale()
    {
        System.out.print("Purchase Total: $" + cost);
    }
}
