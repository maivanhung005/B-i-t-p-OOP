package bai11;

public class Test {
    public static void main(String[] args) {
        GVCoHuu gvCoHuu = new GVCoHuu();
        GVThinhGiang gvThinhGiang = new GVThinhGiang();

        System.out.println("Nhập thông tin giảng viên cơ hữu:");
        gvCoHuu.nhapThongTin();
        System.out.println("\nThông tin giảng viên cơ hữu:");
        gvCoHuu.inThongTin();

        System.out.println("\nNhập thông tin giảng viên thỉnh giảng:");
        gvThinhGiang.nhapThongTin();
        System.out.println("\nThông tin giảng viên thỉnh giảng:");
        gvThinhGiang.inThongTin();
    }
}
