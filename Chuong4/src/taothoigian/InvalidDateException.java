package taothoigian;

	// Lớp ngoại lệ tùy chỉnh
	public class InvalidDateException extends Exception {
	    // Hàm khởi tạo nhận vào thông báo lỗi
	    public InvalidDateException(String message) {
	        super(message);
	    }
	}

