package bai12;

public class Test {
    public static void main(String[] args) {
        SVCĐN svcĐn = new SVCĐN();
        SVCĐCQ svcĐcq = new SVCĐCQ();

        System.out.println("Nhập thông tin sinh viên cao đẳng nghề:");
        svcĐn.nhapThongTin();
        System.out.println("\nThông tin sinh viên cao đẳng nghề:");
        svcĐn.inThongTin();

        System.out.println("\nNhập thông tin sinh viên cao đẳng chính quy:");
        svcĐcq.nhapThongTin();
        System.out.println("\nThông tin sinh viên cao đẳng chính quy:");
        svcĐcq.inThongTin();
    }
}
