interface payment {
    void makepament(double amount);
}

class CreditCard implements payment {
    @Override
    public void makepament(double amount) {
        System.out.println("Payment of $" + amount + " made using credit card");
    }
}

class UPI implements payment {
    @Override 
    public void makepament(double amount) {
        System.out.println("Payment of $" + amount + " made using UPI");
    }
}

public class multiinheritanceDemo {
    public static void main(String[] args) {
        payment CreditCard = new CreditCard();
        payment UPI = new UPI();
        CreditCard.makepament(50000);
        UPI.makepament(200);
    }
}
