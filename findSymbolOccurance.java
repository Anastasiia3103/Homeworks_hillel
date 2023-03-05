package hw5;

public class findSymbolOccurance {
    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        String str = "Hello, World!";
        char c = 'o';
        int count = countOccurrences(str, c);
        System.out.println("The character '" + c + "' appears " + count + " times in the string.");
    }
}


