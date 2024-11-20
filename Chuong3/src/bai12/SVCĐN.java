package bai12;
import java.util.Scanner;
public class SVCĐN extends Nguoi {
    private double tongDiemKT;
    private int soMonKT;

    public SVCĐN() {
    }

    public SVCĐN(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien, double tongDiemKT, int soMonKT) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
        this.tongDiemKT = tongDiemKT;
        this.soMonKT = soMonKT;
    }

    @Override
    public double tinhDiem() {
        return tongDiemKT / soMonKT;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tổng điểm các môn kiểm tra: ");
        tongDiemKT = sc.nextDouble();
        System.out.print("Nhập số môn kiểm tra: ");
        soMonKT = sc.nextInt();
    }
}
