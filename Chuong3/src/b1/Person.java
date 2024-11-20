package b1;

public class Person {
    private String name;
    private String dob; // ngày sinh
    private String pob; // nơi sinh
    private char gender; // giới tính: Nam là 'M' và nữ là 'F'
    private String email;
    private String phone;

    // Constructor không tham số
    public Person() {}

    // Constructor có tham số
    public Person(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    // Setter và Getter cho từng thuộc tính
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getPob() {
        return pob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    // Phương thức toString() để hiển thị thông tin của đối tượng
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", pob='" + pob + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
