import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = scanner.next();
        System.out.println("Nhập chuỗi thứ hai");
        String str2 = scanner.next();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Chuỗi thứ nhất và chuỗi thứ 2 giống nhau");
        } else {
            System.out.println("Chuỗi thứ nhất và chuỗi thứ 2 khác nhau");
        }
    }
}
