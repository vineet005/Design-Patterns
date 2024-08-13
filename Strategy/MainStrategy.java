package Strategy;

import java.util.Scanner;

// Strategy Pattern is behavioral design pattern
// which enables selecting an algorithm's behaviour at runtime without altering its class.
// It involves defining a family of algorithm, encapsulating each one into its own class,
// And making them interchangeable within the original context of class.

public class MainStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        while(true){
            System.out.println("1. Pay using Credit Card");
            System.out.println("2. Pay using PayPal");
            System.out.println("3. Pay using BankAccount Transfer");
            System.out.println("4. Exit");

            System.out.println("How Do You Want to Pay The Money?");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Your Credit Card Number: ");
                    String card_Number = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Enter Your Legal Name: ");
                    String card_Holder_Name = sc.nextLine();
                    context.setPayment_Strategy(new CreditCardPayment(card_Number, card_Holder_Name));
                    System.out.println("How Much Do You Want To Pay?");
                    double card_Amount = sc.nextDouble();
                    context.processPayment(card_Amount);
                    break;

                case 2:
                    System.out.print("Enter Your Email: ");
                    String email = sc.nextLine();
                    sc.nextLine();
                    context.setPayment_Strategy(new PayPalPayment(email));
                    System.out.println("How Much Do You Want To Pay?");
                    double pay_Pal_Amount = sc.nextDouble();
                    context.processPayment(pay_Pal_Amount);
                    break;

                case 3:
                    System.out.print("Enter Your Bank Account Number : ");
                    String account_Number = sc.nextLine();
                    sc.nextLine();
                    context.setPayment_Strategy(new BankAccountPayment(account_Number));
                    System.out.println("How Much Do You Want To Pay?");
                    double bank_Account_Amount = sc.nextDouble();
                    context.processPayment(bank_Account_Amount);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input!");
            }

        }
    }
}
