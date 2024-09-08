public class Main {
    public static void main(String[] args) 
    {   
        // Checking to see if cash payment method works 
        // CashPayment cash = new CashPayment();
        // float change = cash.getChange(21.077f, 22.0f);
        // System.out.println("Change to be returned: " + cash.getChange(21.0f, 21.0f)); 

        // Create an instance of the KioskSystem class
        KioskSystem kioskSystem = new KioskSystem();

        // Initialize CashPayment
        kioskSystem.cash = new CashPayment();

        // Call methods in sequence
        // kioskSystem.orderNumber();  // Get the order number
        // kioskSystem.getCostOfSale();
        // kioskSystem.getAmountPaid();  // Get the amount paid from the user
        

        // Calculate and display change
        // kioskSystem.cash.getChange(kioskSystem.costOfSale.cost, kioskSystem.paid.amount);
        // kioskSystem.cash.displayChange();

        boolean validEntry = false;

        while(!validEntry) // Continue loop if entry is not valid
        {
            kioskSystem.orderNumber();  // Get the order number
            validEntry = kioskSystem.getCostOfSale();  // Get the cost of sale from the user
            
            if (validEntry) {
                validEntry = kioskSystem.getAmountPaid();  // Get the amount paid from the user
            }
            
            if (validEntry) {
                validEntry = kioskSystem.getChange();  // Calculate and display change
            }

            if (!validEntry) {
                
                for (int i = 0; i < 10; i++) {System.out.println(">");}
                System.out.println("Invalid entries, try again.");
            }
        }
        
    }
}
