class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}
public class ExpectationHandling{
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        System.out.println("Marks Entered : " + marks);
    }
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException : Invalid Array Index");
        } finally {
            System.out.println("Array Exception Completed");
        }
        System.out.println();
        try {
            String value = "ABC";
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException : Invalid Number");
        } finally {
            System.out.println("Number Exception Completed");
        }
        System.out.println();
        try {
            checkMarks(95);
        } catch (InvalidMarksException e) {
            System.out.println("InvalidMarksException : " + e.getMessage());
        } finally {
            System.out.println("Marks Validation Completed");
        }
        System.out.println();
        System.out.println("Program Continues Successfully...");
    }
}

