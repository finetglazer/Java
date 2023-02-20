import java.util.Scanner;
public class deep_in_var {
    public static void main() {

        // Trong Java, tất cả các kiểu dữ liệu được tách thành hai nhóm: kiểu nguyên thủy và kiểu tham chiếu.
        // Java chỉ cung cấp tám kiểu nguyên thủy. Chúng được tích hợp sẵn trong cú pháp ngôn ngữ dưới dạng từ khóa.
        // Tên của tất cả các kiểu nguyên thủy là chữ thường. 
        // Loại được sử dụng phổ biến nhất là int đại diện cho một số nguyên.

        // Trong hầu hết các trường hợp, một đối tượng thuộc loại tham chiếu có thể được tạo bằng new từ khóa
        String language = new String("java"); //instantiation of String and initialization with "java"
        Scanner scanner = new Scanner(System.in);

        // Sự khác biệt cơ bản giữa kiểu nguyên thủy và kiểu tham chiếu là biến kiểu nguyên thủy lưu trữ giá trị thực,
        // trong khi biến kiểu tham chiếu lưu trữ địa chỉ trong bộ nhớ (tham chiếu) nơi đặt dữ liệu. 

        // Trong so sanh gia tri tham trieu k dung ! va != vì no se so sanh 2 dia chỉ của gia trị
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
        // Để so sánh giá trị 1 cách chính xác dùng equals
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true  
    }
    
}
