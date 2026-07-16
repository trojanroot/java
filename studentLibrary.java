import java.util.Scanner;

//Abstraction
abstract class LibraryService {
    abstract void issueBook(String bookTitle);

    abstract void returnBook(String bookTitle);
}

// inherutance+encapsulation
class user {
    private String name;
    private int userId;

    public user(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getname() {
        return name;
    }

    public int getuserId() {
        return userId;
    }
}

// Student (Polymorphism - Overriding)
class StudentMember extends user {
    public StudentMember(String name, int userId) {
        super(name, userId);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }
}

// Faculty (Polymorphism - Overriding)
class FacultyMember extends user {
    public FacultyMember(String name, int userId) {
        super(name, userId);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }
}

// Main Library Class
class Library extends LibraryService {
    private String[] books = { "Java Basic", "Data Structure", "OOP COncept" };

    // Method Overloading
    public void searchBook(String title) {
        System.out.println("Search by Title: " + title);
    }

    public void searchBook(String title, String author) {
        System.out.println("Search by Title+author: " + title + ", " + author);
    }

    public void searchBook(int isbn) {
        System.out.println("Search by ISBN: " + isbn);
    }

    // Abstraction implementation
    @Override
    void issueBook(String bookTitle) {
        System.out.println("Book Issued: " + bookTitle);
    }

    @Override
    void returnBook(String bookTitle) {
        System.out.println("Book returned: " + bookTitle);
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}

// Main Class (WITH USER INPUT)
public class studentLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        // Show books
        library.showBooks();
        // User input for issuing book
        System.out.print("/n Enter book nameto issue: ");
        String issueBook=sc.nextLine();
        library.issueBook(issueBook);
        //user input for returing book
        System.out.print("\nEnter the book to return ");
        String returmBook=sc.nextLine();
        library.returnBook(returmBook);
        //search example
        System.out.print("\nEnter the title  to search ");
        String title =sc.nextLine();
        library.searchBook(title);

        System.out.print("Enter author name: ");
        String author=sc.nextLine();
        library.searchBook(title, author);

        System.out.print("Enter ISBN number ");
        int isbn=sc.nextInt();
        library.searchBook(isbn);

        sc.nextLine();

        System.out.print("\nEnter student name: ");
        String sName=sc.nextLine();
        System.out.print("Enter student ID: ");
        int sId=sc.nextInt();

        StudentMember student= new StudentMember(sName, sId);

        System.out.print("Enter days late for student: ");
        int sDays=sc.nextInt();
        System.out.println("Student fine:"+ student .calculateFine(sDays));

        sc.nextLine();

        System.out.print("\nEnter faculty name: ");
        String fName=sc.nextLine();
        System.out.print("Enter Faculty Id: ");
        int fId=sc.nextInt();

        FacultyMember faculty=new FacultyMember(fName, fId);
        System.out.print("Enter days late for faculty: ");
        int fDays=sc.nextInt();
        System.out.println("Faculty Fine: "+faculty.calculateFine(fDays));

        sc.close();
    }

}
