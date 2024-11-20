package bai11;
import java.util.Scanner;
public class GVCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSoLuong;
    private int thamNien;

    public GVCoHuu() {
    }

    public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, double luongCoBan, double heSoLuong, int thamNien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
    }

    @Override
    public double tinhLuong() {
        double phuCap = 0;
        if (thamNien >= 5) {
            phuCap = (0.05 + (thamNien - 5) * 0.01) * luongCoBan;
        }
        return luongCoBan * heSoLuong + phuCap;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhập thâm niên công tác (năm): ");
        thamNien = sc.nextInt();
    }
}
