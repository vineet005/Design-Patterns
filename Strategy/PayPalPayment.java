package Strategy;

public class PayPalPayment implements PaymentStrategy{
    private final String EMAIL;

    public PayPalPayment(String email){
        this.EMAIL = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" via PayPal!\n");
    }
}
