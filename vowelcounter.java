public class vowelcounter {
    public static void main(String[] args) {
        String str = "helloworld";
        int vowel = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("String: " + str);
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonants);
    }
}
