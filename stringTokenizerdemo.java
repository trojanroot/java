import java.util.Scanner;
import java.util.StringTokenizer;

public class stringTokenizerdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        int count = 0;
        StringTokenizer st = new StringTokenizer(sentence);
        // int count=st.countToken
        while (st.hasMoreElements()) {
            String word = st.nextToken();
            count++;
        }
        System.out.println("Token word: " + count);
        sc.close();
    }
}
