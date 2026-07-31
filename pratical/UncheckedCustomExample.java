class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String message){
        super(message);
    }
}
public class UncheckedCustomExample {
    static void withdraw(double Amount){
        if(Amount<0){
            throw new InvalidAmountException("Amount cannot be negative");
        }
        System.out.println("Widthdraw AMount: +amount");
    }
    public static void main(String[] args) {
        withdraw(400);
    }
}
