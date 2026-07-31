public class ExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured: "+e);
        }
        finally{
            System.out.println("Execution Of the division operation is complete");
        }
    }
}
