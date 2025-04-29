import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args){

    }
    private static void sortIntArray() {
        int scores[] = {23, 98, 77, 58, 89, 45};
        double scores2[] = {23.3, 98.1, 77.8, 58.4, 89.89, 45.53};
        display(scores); // call display(int[])
        Arrays.sort(scores);
        System.out.println("---- after sorting ----");
        display(scores);
        int index = Arrays.binarySearch(scores, 89);
        System.out.println("index=" + index);
        if (index < 0) {
            System.out.println("not found " + index);
        } else {
            System.out.println("Found, index is " + index);
        }
    }

    private static void sortStringArray{
        String fruits[] = {"guava", "pear", "peach", "grape", "melon", "pine", "banana", "apple"};
        display(fruits);
        Arrays.sort(fruits);
        System.out.println("----fruits----");
        display(fruits);
    }

    private static <T> void display(T x[]) {
        System.out.println("[");
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                System.out.println();
            }
        }

    }
}
