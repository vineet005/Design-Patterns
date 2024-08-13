package Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private final String CREDIT_CARD_NUMBER;
    private final String CARD_HOLDER_NAME;

    public CreditCardPayment(String credit_Card_Number, String card_Holder_Name){
        this.CREDIT_CARD_NUMBER = credit_Card_Number;
        this.CARD_HOLDER_NAME = card_Holder_Name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" using Credit Card!\n");
    }
}
