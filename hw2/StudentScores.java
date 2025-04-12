import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];
        int[] ranges = new int[5]; 
        int total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            total += scores[i];

            if (scores[i] >= 90) {
                ranges[0]++;
            } else if (scores[i] >= 80) {
                ranges[1]++;
            } else if (scores[i] >= 70) {
                ranges[2]++;
            } else if (scores[i] >= 60) {
                ranges[3]++;
            } else {
                ranges[4]++;
            }
        }

        System.out.println("\nEntered scores:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
        }

        System.out.println("Number of students with scores between 90-100: " + ranges[0]);
        System.out.println("Number of students with scores between 80-89: " + ranges[1]);
        System.out.println("Number of students with scores between 70-79: " + ranges[2]);
        System.out.println("Number of students with scores between 60-69: " + ranges[3]);
        System.out.println("Number of students with scores between 0-59: " + ranges[4]);

        double average = (double) total / 10;
        System.out.printf("Average score: %.2f\n", average);
    }
}