package hw11;

import java.io.*;
import java.util.*;

public class UsageInfoTest {
    public static void main(String[] args) {
        List<UsageInfo> usageList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Java\\hw11\\cell.csv"))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 6) {
                    String tech = tokens[0].trim();
                    String yearMonth = tokens[1].trim();
                    String company = tokens[2].trim();
                    double totalMinutes = Double.parseDouble(tokens[3].trim());
                    long users = Long.parseLong(tokens[4].trim());
                    double avgMinutes = Double.parseDouble(tokens[5].trim());

                    usageList.add(new UsageInfo(tech, yearMonth, company, totalMinutes, users, avgMinutes));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        //依用戶數排序(由小至大）
        System.out.println("\nSorted by Users (Ascending):");
        usageList.sort(Comparator.comparingLong(UsageInfo::getUsers));
        usageList.forEach(System.out::println);

        //依年月排序（年優先）
        System.out.println("\nSorted by Year/Month:");
        usageList.sort(Comparator.comparingInt(UsageInfo::getYear)
                                 .thenComparingInt(UsageInfo::getMonth));
        usageList.forEach(System.out::println);
    }
}

