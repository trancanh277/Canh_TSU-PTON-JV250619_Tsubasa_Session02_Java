import java.util.Scanner;
public class baitap07 {
    public static void main(String[] args) {
        System.out.println("Nhập vào cạnh a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập vào cạnh b");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh c");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            }
            else if (a == b || b == c || c == a ) {
                System.out.println("Đây là tam giác  cân");
            }
            else if (a * a == (b * b) + (c * c) || b * b == (a * a) + (c * c) || c * c == (a * a) + (b * b)  ) {
                System.out.println("Đây là tam giác vuông");
            }
            else {
                System.out.println("Đây là tam giác thường");
            }
        }
        else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
    }
}
