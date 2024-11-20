package bai10;

public class Test {
    public static void main(String[] args) {
        HocvienDH hocvienDH = new HocvienDH();
        HocvienLT hocvienLT = new HocvienLT();

        System.out.println("Nhập thông tin học viên Đồ Họa:");
        hocvienDH.nhapThongTin();
        System.out.println("\nThông tin học viên Đồ Họa:");
        hocvienDH.inThongTin();

        System.out.println("\nNhập thông tin học viên Lập Trình:");
        hocvienLT.nhapThongTin();
        System.out.println("\nThông tin học viên Lập Trình:");
        hocvienLT.inThongTin();
    }
}
