import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    static Random random = new Random();
    static final int APLUS = 0;
    static final int A = 1;
    static final int B = 2;
    static final int C = 3;
    static final int D = 4;

    public static void main(String[] args) {
        System.out.println("1 << 4 is" + (1 << 4));
        int scores[] = { 80, 67, 88, 65, 73, 98, 75, 62 };
        System.out.println("mean is" + mean(scores));
        testMaxMin(scores);
        testPassByValue();
        testInteger();
    }

    static void testStatistics() {
        int scores[] = generateRandomNumbers(50);
        double mean = mean(scores);
        double var = variance(scores, mean);
        System.out.println("average of scores is" + mean);
        System.out.println("standard deviation is" + Math.sqrt(var));
    }

    static double summation(int x[]) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    static double mean(int x[]) {
        return summation(x);
    }

    static double variance(int x[], double mean) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + Math.pow(x[i] - mean, 2);
            // sum += (x[i] - mean) * (x[i] - mean);
            double delta = x[i] - mean;
            sum += delta * delta;
        }
        return sum / x.length;
    }

    static void findMeanVar(int x[]) {
        double m = 0, v = 0;
        for (int i = 0; i < x.length; i++) {
            m += x[i];
            v += x[i] * x[i];
        }
        m /= x.length; // mean
        v = v / x.length - m * m;
        System.out.println("mean" + m + "var" + v);
    }

    static void testMaxMin(int scores[]) {
        System.out.println("max is" + maximun(scores) + "\t min is" + minimun(scores));
        System.out.println("argmax of scores is" + argmax(scores));
    }

    static int maximun(int x[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    static int minimun(int x[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    static int argmax(int x[]) {
        int argmax = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
                argmax = i;
            }
        }
        return argmax;
    }

    static void testWhileBreak() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int scores[];
        scores = new int[100];
        while (true) {
            System.out.println("Please input the score for student" + counter + ":");
            System.out.println("Please type q to quit");
            String line = scanner.nextLine();
            if (line.equals("q") || line.equals("Q")) {
                break;
            }
            scores[counter] = Integer.parseInt(line);
        }
    }

    static void testContinue() {
        int counter = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            // Accept multiple of 2 or 3
            if (i % 3 == 0 || i % 2 ==0) {
                counter++;
                sum += i
            }
            // Accept NOT multiple of 2 or 3
            // if (!(i% 3 == 0 || i % 2 ==0)) {sum += i};
            //
            //if (i % 3 == 0 || i % 2 ==0) continue {counter++;sum += i}

            //Accept multiple of 2 or 3 but NOT multiple of 6
            //if ((i % 3 == 0 || i % 2 ==0) && !(i % 6 == 0)) 
            //{counter++;sum += i}

            if (i % 3 == 0 || i % 2 ==0) {
                if (i % 6 == 0) {
                    continue;
                }
                counter++;
                sum += i;
            }
        }
    }

    static int score2GradeSwitch(int score) {
        int q = score / 10;
        int retCode = D;
        switch (q) {
            case 10:
            case 9:
                retCode = APLUS;
                break;
            case 8:
                return A;
            case 7:
                return B;
            case 6:
                return C;
            default:
                break;
        }
        return retCode;
    }

    static int score2Grade(int score) {
        if (score >= 90) {

        }
    }

    static void testPassByReference(int scores[]) {
        doubleScores(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + "\t" + scores[i]);
        }
    }

    static void doubleScores(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] = 2 * x[i];
        }
    }

    static void testPassByValue() {
        int a = 8;
        doubleValue(a);
    }

    static void doubleValue(int x) {
        x = 2 * x;
    }
}