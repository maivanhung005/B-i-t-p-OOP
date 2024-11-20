package bai6;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng PartTimeEmployee với constructor có tham số
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nguyễn Văn A", 25, 'M', "Công ty B", "01/01/2020", 20);

        // Hiển thị thông tin nhân viên bán thời gian
        System.out.println(partTimeEmployee);

        // Kiểm tra các phương thức setter
        partTimeEmployee.setName("Trần Thị B");
        partTimeEmployee.setAge(30);
        partTimeEmployee.setGender('F');
        partTimeEmployee.setEmployerName("Công ty C");
        partTimeEmployee.setDateHired("15/03/2021");
        partTimeEmployee.setHoursPerWeek(25);

        // Hiển thị thông tin nhân viên bán thời gian sau khi thay đổi
        System.out.println(partTimeEmployee);
    }
}
