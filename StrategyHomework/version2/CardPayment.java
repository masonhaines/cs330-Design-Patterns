import java.util.Scanner;

public class CardPayment implements PaymentInterface{
    
    int cardNumber;

    @Override // Implementation of processPayment method from PaymentInterface
    public void processPayment(PaymentInformation cost, Scanner cin, Stores stores) {
        int userInput = cost.paymentType(); // Get user input for either cash or card

        if(userInput == 1) // Cash
        {
            stores.orderNumber();
            // Set cost and amount paid
            float Cost = cost.setCostOfSale(cin);
            float amountPaid = cost.setAmountPaid(cin);
            // get updated values
            Cost = cost.getCost();
            amountPaid = cost.getAmountPaid();
            cost.getChange(Cost, amountPaid);
        }
        else if (userInput == 2) // Card
        {
            stores.orderNumber();
            cost.setCostOfSale(cin);
            setCardNumber(cin);
            cost.displayCostOfSale();
        }
    }

    public int setCardNumber(Scanner cin)
    {   
        System.out.print("Please Enter a 4 digit Card Number: ");
        int cardNum = cin.nextInt();
        if(!checkCardNumber(cardNum)) return -1;
        
        this.cardNumber = cardNum;
        return cardNum;
    }

    public boolean checkCardNumber(long cardNum)
    {
        if (String.valueOf(cardNum).length() != 4) 
        {
            System.out.println("Card Number must be 4 digits");
            return false;
        }
        return true;
    }
}
