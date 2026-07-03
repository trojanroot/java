interface payment {
    void pay(double amount);
}

class CreditCardPayment implements payment {
    @Override
    public void pay(double amount) {
        System.out.println("payment of Rs. " + amount + "made using credit card. ");
    }
}

class UPIPayment implements payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of RS. " + amount + "made using UPI.");
    }
}

public class paymentDemo {
    public static void main(String[] args) {
        payment payment1 = new CreditCardPayment();
        payment payment2 = new UPIPayment();

        payment1.pay(5000);
        payment2.pay(2500);
    }
}
