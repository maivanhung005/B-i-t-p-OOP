package b1;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng từ lớp Person
        Person person = new Person("Nguyen Cong Thanh", "05/04/2004", "Hanoi", 'M', "congthanh424@gmail.com", "0368875553");

        // Kiểm tra các phương thức setter(), getter(), và toString()
        System.out.println("Initial Information:");
        System.out.println(person);

        // Sử dụng phương thức setter để thay đổi thông tin
        person.setName("Duong Thi Hoa");
        person.setDob("14/01/2001");
        person.setPob("Ho Chi Minh City");
        person.setGender('F');
        person.setEmail("dthoa21@gmail.com");
        person.setPhone("0987663112");

        // Hiển thị thông tin đã thay đổi
        System.out.println("Updated Information:");
        System.out.println(person);

        // Sử dụng phương thức getter để lấy thông tin
        System.out.println("Name: " + person.getName());
        System.out.println("Date of Birth: " + person.getDob());
        System.out.println("Place of Birth: " + person.getPob());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Phone: " + person.getPhone());
    }
}
