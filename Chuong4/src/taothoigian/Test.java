package taothoigian;

	// Lớp Test để kiểm tra việc xử lý ngoại lệ
		public class Test {
		    public static void main(String[] args) {
		        try {
		            // Tạo đối tượng ThoiGian hợp lệ
		            ThoiGian thoiGian1 = new ThoiGian(31, 12, 2024);
		            System.out.println(thoiGian1);

		            // Điều này sẽ ném ra ngoại lệ InvalidDateException
		            ThoiGian thoiGian2 = new ThoiGian(32, 1, 2024);
		            System.out.println(thoiGian2);
		        } catch (InvalidDateException e) {
		            System.out.println("Lỗi: " + e.getMessage());
		        }

		        try {
		            // Điều này sẽ ném ra ngoại lệ InvalidDateException
		            ThoiGian thoiGian3 = new ThoiGian(30, 13, 2024);
		            System.out.println(thoiGian3);
		        } catch (InvalidDateException e) {
		            System.out.println("Lỗi: " + e.getMessage());
		        }

		        try {
		            // Điều này sẽ ném ra ngoại lệ InvalidDateException
		            ThoiGian thoiGian4 = new ThoiGian(30, 11, -1);
		            System.out.println(thoiGian4);
		        } catch (InvalidDateException e) {
		            System.out.println("Lỗi: " + e.getMessage());
		        }
		    }
		}
