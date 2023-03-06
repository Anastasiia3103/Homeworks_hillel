package hw5;

public class StringReverse {

    public static String reverseRecursively(String source) {
        if ( source == null || source.isEmpty() ) {
            return source;
        }
        return source.charAt(source.length() - 1) + reverseRecursively(source.substring(0, source.length() - 1));
    }


    public static void main(String[] args) {
        String originalString = "Hello World!";

        System.out.println(reverseRecursively(originalString));
    }
}

