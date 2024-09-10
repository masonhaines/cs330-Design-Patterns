import java.util.Scanner;

public class CashPayment implements PaymentInterface{

    @Override
    public void processPayment(PaymentInformation cost, Scanner cin, Stores stores) {
        stores.orderNumber();
        // Set cost and amount paid
        float Cost = cost.setCostOfSale(cin);
        float amountPaid = cost.setAmountPaid(cin);
        // get updated values
        Cost = cost.getCost();
        amountPaid = cost.getAmountPaid();
        cost.getChange(Cost, amountPaid);
    }
}
