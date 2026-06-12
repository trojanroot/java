import java.util.StringTokenizer;

public class stringTokenizerint {
    public static void main(String[] args) {
        String date = "15/10/2022";
        StringTokenizer st = new StringTokenizer(date, "/");
        String day = st.nextToken();
        String month = st.nextToken();
        String year = st.nextToken();

        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("year: " + year);
    }
}
