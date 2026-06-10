class bankaccount{
    private String accountholder;
    private double amount;

    public void setaccountholder(String name){
        this.accountholder=name;
    }
    public void setamount(double amount){
        this.amount=amount;
    }
    public String getaccountholder(){
        return accountholder;
    }
    public double getamount(){
        return amount;
    } 
}
public class encapsulationeg {
    public static void main(String[] args) {
        bankaccount ba=new bankaccount();
        ba.setaccountholder("aryan");
        ba.setamount(500000);
        System.out.println("Account holder: "+ba.getaccountholder());
        System.out.println("balance "+ba.getamount());
    }
}
