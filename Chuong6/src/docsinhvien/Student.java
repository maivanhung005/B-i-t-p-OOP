package docsinhvien;

 import java.io.*;
import java.util.ArrayList;

public class Student implements Serializable {
    private String code;
    private String name;
    private String gender;
    private String dob; // Ngày tháng năm sinh dạng chuỗi

    public Student(String code, String name, String gender, String dob) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }



    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("SV001", "Nguyen Van A", "Nam", "01/01/2000"));
        students.add(new Student("SV002", "Tran Thi B", "Nu", "02/02/2001"));

        // Ghi thông tin sinh viên vào file student.dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc thông tin sinh viên từ file student.dat
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            ArrayList<Student> readStudents = (ArrayList<Student>) ois.readObject();
            for (Student student : readStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
