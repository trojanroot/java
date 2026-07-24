interface Payment {
    boolean pay(double amount); // returns true if payment succeeds
}
 
// ---------- Polymorphism: multiple implementations of Payment ----------
class CreditCardPayment implements Payment {
    // Encapsulation: private fields, controlled access
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
 
    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
 
    @Override
    public boolean pay(double amount) {
        // In real life: call a payment gateway / bank API here
        System.out.printf("Processing $%.2f via Credit Card ending in %s%n",
                amount, cardNumber.substring(cardNumber.length() - 4));
        return true;
    }
}
 


class WalletPayment implements Payment {
    private String walletId;
    private double balance;
 
    public WalletPayment(String walletId, double balance) {
        this.walletId = walletId;
        this.balance = balance;
    }
 
    @Override
    public boolean pay(double amount) {
        if (amount > balance) {
            System.out.println("Wallet payment failed: insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.printf("Processing $%.2f via Wallet (%s). Remaining balance: $%.2f%n",
                amount, walletId, balance);
        return true;
    }
 
    public double getBalance() {
        return balance;
    }
}
 
// ---------- Checkout class: processes payment ----------
// SRP: Checkout is only responsible for orchestrating the payment process
// DIP: Checkout depends on the Payment abstraction, not concrete classes
// OCP: New payment methods (e.g., UPIPayment) can be added without modifying Checkout
class Checkout {
    private Payment paymentMethod;
 
    // Dependency is injected (constructor injection) -> supports DIP
    public Checkout(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
 
    public void processPayment(double amount) {
        System.out.println("---- Checkout started ----");
        boolean success = paymentMethod.pay(amount);
        if (success) {
            System.out.println("Payment successful! Order confirmed.");
        } else {
            System.out.println("Payment failed! Order not placed.");
        }
        System.out.println("---------------------------");
    }
}
 
// ---------- Demo ----------
public class PaymentProcessingSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("1234567812345678", "John Doe", "12/27", "123");
        Checkout checkout1 = new Checkout(creditCard);
        checkout1.processPayment(250.75);
 
        Payment wallet = new WalletPayment("wallet_001", 100.0);
        Checkout checkout2 = new Checkout(wallet);
        checkout2.processPayment(50.0);
        checkout2.processPayment(80.0); // should fail - insufficient balance
    }
}
 