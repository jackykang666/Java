import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // 讀取文字檔並建立Student物件列表
        List<Student> students = readStudentsFromTextFile("students.txt");
        
        // 將Student列表寫入二進位檔
        writeStudentsToBinaryFile(students, "students.dat");
        
        // 從二進位檔讀取並驗證資料
        List<Student> readStudents = readStudentsFromBinaryFile("students.dat");
        System.out.println("讀取的學生資料：");
        for (Student student : readStudents) {
            System.out.println(student);
        }
    }

    // 從文字檔讀取學生資料
    private static List<Student> readStudentsFromTextFile(String filename) {
        List<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String name = parts[0].trim();
                    String id = parts[1].trim();
                    int year = Integer.parseInt(parts[2].trim());
                    int month = Integer.parseInt(parts[3].trim());
                    int day = Integer.parseInt(parts[4].trim());
                    students.add(new Student(name, id, new Date(year, month, day)));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("找不到檔案: " + filename);
        }
        return students;
    }

    // 將學生列表寫入二進位檔
    private static void writeStudentsToBinaryFile(List<Student> students, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("學生資料已寫入 " + filename);
        } catch (IOException e) {
            System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }

    // 從二進位檔讀取學生列表
    @SuppressWarnings("unchecked")
    private static List<Student> readStudentsFromBinaryFile(String filename) {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("讀取檔案時發生錯誤: " + e.getMessage());
        }
        return students;
    }
}