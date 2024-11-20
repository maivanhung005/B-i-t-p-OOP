package bai12;
import java.util.Scanner;
public class SVCĐCQ extends Nguoi {
    private double tongDiemKT;
    private int soMonKT;
    private double diemThiKTHP;

    public SVCĐCQ() {
    }

    public SVCĐCQ(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien, double tongDiemKT, int soMonKT, double diemThiKTHP) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
        this.tongDiemKT = tongDiemKT;
        this.soMonKT = soMonKT;
        this.diemThiKTHP = diemThiKTHP;
    }

    @Override
    public double tinhDiem() {
        return (tongDiemKT / soMonKT + diemThiKTHP) / 3;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tổng điểm các môn kiểm tra: ");
        tongDiemKT = sc.nextDouble();
        System.out.print("Nhập số môn kiểm tra: ");
        soMonKT = sc.nextInt();
        System.out.print("Nhập điểm thi kết thúc học phần: ");
        diemThiKTHP = sc.nextDouble();
    }
}
