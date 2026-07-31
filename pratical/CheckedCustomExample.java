class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CheckedCustomExample {
    static void registerStudent(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Student Age must be 18");
        }
        System.out.println("Student Registered Successful");
    }

    public static void main(String[] args) {
        try {
            registerStudent(15);
        } catch (InvalidAgeException e) {
            System.out.println("Checked Custom Expection: " + e.getMessage());
        }
    }
}
