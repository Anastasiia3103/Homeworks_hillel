package hw5;

public class FindWordPosition {


    public static int findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        return index;
    }

    public static void main(String[] args) {
        String source = "Yellow, black, brown, blue";
        String target = "brown";
        int position = findWordPosition(source, target);

        if ( position == -1 ) {
            System.out.println(target + " not found in " + source);
        }
        else {
            System.out.println(target + " found at position " + position);
        }
    }
}

