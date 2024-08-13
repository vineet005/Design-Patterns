package Strategy;

public class PaymentContext {
    private PaymentStrategy payment_Strategy;

    public void setPayment_Strategy(PaymentStrategy payment_Strategy){
        this.payment_Strategy = payment_Strategy;
    }

    public void processPayment(double amount){
        payment_Strategy.pay(amount);
    }
}
