package bai6;

public class Person {
    private String name;
    private int age;
    private char gender;

    // Constructor mặc định
    public Person() {
    }

    // Constructor có tham số
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Các phương thức getter và setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // Phương thức toString để hiển thị thông tin
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}
