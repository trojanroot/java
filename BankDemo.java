class Bank {
    public double interestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    public double interestRate() {
        return 7.5;
    }
}

class NabilBank extends Bank {
    public double interestRate() {
        return 8.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new NabilBank();
        System.out.println("SBI interest rate: " + b1.interestRate() + " %");
        System.out.println("NabilBank interest rate: " + b2.interestRate() + " %");

    }
}
