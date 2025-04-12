import java.util.Random;

public class Ex3 {
    public static main(String[] args) {
        System.out.println();
    }

    public static void singleDiceTossing() {
        int freq[] = new int[13];
        for (int i = 0; i < 1000; i++) {
            int point1 = ramdom.nextInt(6) + 1;
            int point2 = ramdom.nextInt(6) + 1;
            int sum = point1 + point2;
            freq[sum]++;
        }
        printElements(freq)
    }

    public static void printElements(int x[]) {
        System.out.println("---------");
        for (int i = 0; i < x.length; i++) {
            
        }
    }

    public static void testObjectArray() {
        Date d;
        d = new Date(10, 5)
        Date holidays[];
        holidays = new Date[10]
        System.out.println("-----------");
        for (int i = 0; i < holidays.length; i++) {
            System.out.println(i + "\t" + holidays[i]);
        }
    }

    holidays[0] = new Date(1, 1);
    holidays[1] = new Date(4, 4);
    holidays[2] = new Date(4, 5);
    holidays[3] = new Date(5, 1);
    System.out.println("----------");
    for (int i = 0; i < holidays.length; i++) {
        System.out.println(i + "\t" + holidays[i]);
    }
}