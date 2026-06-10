public class stringimmutability {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String " + str);
        System.out.println("Memory Address Before " + System.identityHashCode(str));

        str.concat(" World");
        System.out.println("\n After concat() without assignment:");
        System.out.println("String: " + str);
        System.out.println("Memory Address :" + System.identityHashCode(str));

        str = str.concat(" World");
        System.out.println("\n After concat() with assignment:");
        System.out.println("String: " + str);
        System.out.println("Memory Address after:" + System.identityHashCode(str));

    }
}
