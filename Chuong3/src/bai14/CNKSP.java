package bai14;
import java.util.Scanner;
public class CNKSP extends CongNhan {
    private int soSanPham;
    private double donGiaSanPham;
    private final int MUC_QUY_DINH = 1000;

    public CNKSP() {
    }

    public CNKSP(String hoTen, String diaChi, String ngaySinh, String loaiCongNhan, int soSanPham, double donGiaSanPham) {
        super(hoTen, diaChi, ngaySinh, loaiCongNhan);
        this.soSanPham = soSanPham;
        this.donGiaSanPham = donGiaSanPham;
    }

    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soSanPham >= MUC_QUY_DINH + 150) {
            thuong = 1500000;
        } else if (soSanPham >= MUC_QUY_DINH + 100) {
            thuong = 1000000;
        }
        return soSanPham * donGiaSanPham + thuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        soSanPham = sc.nextInt();
        System.out.print("Nhập đơn giá sản phẩm: ");
        donGiaSanPham = sc.nextDouble();
    }
}

