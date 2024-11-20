package bai14;

public class Test {
    public static void main(String[] args) {
        CNKSP cnksp = new CNKSP();
        CNTCN cntcn = new CNTCN();

        System.out.println("Nhập thông tin công nhân khoán sản phẩm:");
        cnksp.nhapThongTin();
        System.out.println("\nThông tin công nhân khoán sản phẩm:");
        cnksp.inThongTin();

        System.out.println("\nNhập thông tin công nhân tính công nhật:");
        cntcn.nhapThongTin();
        System.out.println("\nThông tin công nhân tính công nhật:");
        cntcn.inThongTin();
    }
}
