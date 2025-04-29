package hw9;

import java.util.*;

class Student{
	String name;
    int id;
    int grade;
	
    public Student(String name ,int id  ,int grade){
        this.name =name;
        this.id = id;
        this.grade = grade;
	}

	public String toString(){
        return String.format("%s, %d, %d", name, id, grade);
    }
}

class CompareName implements Comparator< Student >{
    public int compare(Student x, Student y){
        return x.name.compareTo(y.name);
    }
}

class CompareID implements Comparator< Student >{
    public int compare(Student x, Student y){
        return Integer.compare(x.id, y.id);
    }
}

class CompareGrade implements Comparator< Student >{
    public int compare(Student x, Student y){
        return Integer.compare(y.grade, x.grade);
    }
}

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Caleb", 104992, 99),
            new Student("Derek", 102113, 88),
            new Student("Dylan", 101111, 12),
            new Student("Anthony", 109123, 13),
            new Student("Bruce", 102334, 12),
            new Student("Spike", 110222, 1)
        };

        // 成績排序（大→小）
        Arrays.sort(students, new CompareGrade());
        System.out.println("按成績排序（高到低）:");
        for (Student s : students) {
            System.out.println(s);
        }

        // 姓名排序（A→Z）
        Arrays.sort(students, new CompareName());
        System.out.println("\n按姓名排序（A到Z）:");
        for (Student s : students) {
            System.out.println(s);
        }

        // 學號排序（小→大）
        Arrays.sort(students, new CompareID());
        System.out.println("\n按學號排序（小到大）:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

