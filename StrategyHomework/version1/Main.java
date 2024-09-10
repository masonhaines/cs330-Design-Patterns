public class Main {
    public static void main(String[] args) 
    {   

        KioskSystem kioskSystem = new KioskSystem();
        kioskSystem.cash = new CashPayment();

        StoreSystem storeSystem = new StoreSystem();
        storeSystem.card = new CardPayment();
        storeSystem.cash = new CashPayment();

        boolean validEntry = false;
       
        while(!validEntry) // Continue loop if entry is not valid
        {   
            System.out.println("Kiosk***********************************************************************Kiosk");
            kioskSystem.orderNumber();  // Get the order number
            validEntry = kioskSystem.getCostOfSale();  // Get the cost of sale from the user
            
            if (validEntry) {
                validEntry = kioskSystem.getAmountPaid();  // Get the amount paid from the user
            }
            
            if (validEntry) {
                validEntry = kioskSystem.getChange();  // Calculate and display change
            }

            System.out.println("Store***********************************************************************Store");
            storeSystem.orderNumber(); // Get order Number
            // storeSystem.paymentType(); // Not being used but implemented 
            
            // Card
            validEntry = storeSystem.getCostOfSale();  // Get the cost of sale from the user

            if (validEntry) {
                validEntry = storeSystem.getCardNumber();  // Get Card number
            }
            
            // Cash
            System.out.println("Store***********************************************************************Store");
            storeSystem.orderNumber(); // Get order Number
            validEntry = storeSystem.getCostOfSale();  // Get the cost of sale from the user
        
            if (validEntry) {
                validEntry = storeSystem.getAmountPaid();  // Get the amount paid from the user
            }
            
            if (validEntry) {
                validEntry = storeSystem.getChange();  // Calculate and display change
            }

            if (!validEntry) { // if not a valid entry  reset loop
                
                for (int i = 0; i < 10; i++) {System.out.println(">");}
                System.out.println("Invalid entries, try again.");
            }
            

        }
    
    }
        
        
    
}