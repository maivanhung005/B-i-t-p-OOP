package bai3;

public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    // Constructor mặc định
    public NhanVien() {
    }

    // Constructor có tham số
    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    // Các phương thức getter và setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    // Phương thức toString để hiển thị thông tin nhân viên
    @Override
    public String toString() {
        return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
    }
}
