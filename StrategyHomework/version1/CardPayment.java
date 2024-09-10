public class CardPayment {
    
    long cardNumber;

    public long getCardNumber(long cardNum)
    {
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