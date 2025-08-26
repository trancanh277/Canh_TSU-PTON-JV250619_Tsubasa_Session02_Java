import java.util.Scanner;
public class baitap03 {
    public static void main(String[] args) {
        int tong = 0;
        System.out.println("Mời nhập vào số nguyên dương n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0 ){
            System.out.println("Số nhập vào không hợp lệ");
        }
        for (int i = 0; i <= n; i++) {
            tong += i;
        }
        System.out.printf("Tổng các số từ 1 đến %d là: %d", n, tong);
    }
}
