package hw8;

import java.io.*;
import java.util.*;

public class SurveyAnalysis {
    public static void main(String[] args) {
        int[][] scores = new int[10][6]; 

        try {
            Scanner scanner = new Scanner(new File("C:\\Java\\hw8\\log.txt"));
            int respondent = 0;

            while (scanner.hasNextLine() && respondent < 10) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                for (int i = 0; i < 6; i++) {
                    scores[respondent][i] = Integer.parseInt(tokens[i].trim());
                }
                respondent++;
            }

            scanner.close();

            // 印出原始資料
            System.out.println("Survey Scores:");
            for (int i = 0; i < scores.length; i++) {
                System.out.print("Respondent " + (i + 1) + ": ");
                for (int j = 0; j < scores[i].length; j++) {
                    System.out.print(scores[i][j] + " ");
                }
                System.out.println();
            }

            // 每位填答者的平均分數
            System.out.println("\nAverage score per respondent:");
            for (int i = 0; i < scores.length; i++) {
                int sum = 0;
                for (int j = 0; j < 6; j++) {
                    sum += scores[i][j];
                }
                System.out.printf("Respondent %d: %.2f\n", i + 1, (double) sum / 6);
            }

            // 每個問題的最大/最小/平均
            System.out.println("\nStatistics per question:");
            for (int q = 0; q < 6; q++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                int total = 0;

                for (int r = 0; r < 10; r++) {
                    int val = scores[r][q];
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                    total += val;
                }

                System.out.printf("Question %d -> Max: %d, Min: %d, Average: %.2f\n",
                                  q + 1, max, min, (double) total / 10);
            }

        // 如果讀取不到文件log.txt
        } catch (IOException e) {
            System.out.println("Error: log.txt not found");
        }
    }
}

