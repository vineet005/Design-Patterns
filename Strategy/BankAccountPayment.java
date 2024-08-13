package Strategy;

public class BankAccountPayment implements PaymentStrategy{
    private final String ACCOUNT_NUMBER;

    public BankAccountPayment(String account_Number){
        this.ACCOUNT_NUMBER = account_Number;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs."+amount+" through Bank Account!\n");
    }
}
