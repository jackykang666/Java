import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String id;
    private Date birthday;

    public Student(String name, String id, Date birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", id='" + id + '\'' +
               ", birthday=" + birthday +
               '}';
    }
}
