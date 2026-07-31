import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("my_secret.txt");
            System.out.println("File found sucessfully");
            file.close();
        }catch(FileNotFoundException e){
            System.out.println("Error: THe file could not be found. Please Check the path");
        }catch(IOException e){
            System.out.println("Something went wrong while closing the file");
        }
        finally{
            System.out.println("Execution of the file operation is complete");
        }
    }
}
