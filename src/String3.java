import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = scanner.next();
        System.out.println("Nhập chuỗi thứ hai");
        String str2 = scanner.next();
        String str = str1.concat(str2);
        System.out.println(str);
    }
}
