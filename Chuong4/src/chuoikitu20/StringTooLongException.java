package chuoikitu20;

//Lớp ngoại lệ tùy chỉnh
class StringTooLongException extends Exception {
 public StringTooLongException(String message) {
     super(message);
 }
}

