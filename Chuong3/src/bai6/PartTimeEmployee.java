package bai6;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;

    // Constructor mặc định
    public PartTimeEmployee() {
    }

    // Constructor có tham số
    public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek) {
        super(name, age, gender, employerName, dateHired);
        this.hoursPerWeek = hoursPerWeek;
    }

    // Các phương thức getter và setter
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    // Phương thức toString để hiển thị thông tin nhân viên bán thời gian
    @Override
    public String toString() {
        return super.toString() + ", PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
    }
}
