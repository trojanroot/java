class std{
    private std(){
        System.out.println("Private Constractor called.");
    }
    public static void displayMessage() {
        System.out.println("Hello from std class!!!");
    }
}
class privateConstractor {
    public static void main(String[] args) {
       std.displayMessage();
    }
}
