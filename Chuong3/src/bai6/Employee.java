package bai6;

public class Employee extends Person {
    private String employerName;
    private String dateHired;

    // Constructor mặc định
    public Employee() {
    }

    // Constructor có tham số
    public Employee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    // Các phương thức getter và setter
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    // Phương thức toString để hiển thị thông tin nhân viên
    @Override
    public String toString() {
        return super.toString() + ", Employee [employerName=" + employerName + ", dateHired=" + dateHired + "]";
    }
}
