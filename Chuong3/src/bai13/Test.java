package bai13;

public class Test {
    public static void main(String[] args) {
        LaoDongPhothong ldPhothong = new LaoDongPhothong();
        Kisu kisu = new Kisu();

        System.out.println("Nhập thông tin lao động phổ thông:");
        ldPhothong.nhapThongTin();
        System.out.println("\nThông tin lao động phổ thông:");
        ldPhothong.inThongTin();

        System.out.println("\nNhập thông tin kĩ sư:");
        kisu.nhapThongTin();
        System.out.println("\nThông tin kĩ sư:");
        kisu.inThongTin();
    }
}
