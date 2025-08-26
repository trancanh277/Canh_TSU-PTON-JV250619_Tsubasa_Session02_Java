import java.util.Scanner;
public class baitap06 {
    public static void main(String[] args) {
        System.out.println("Mời nhập vào số nguyên n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int chiadu = n % 10;
            sum += chiadu;
            n /= 10;
        }
        System.out.printf("Tổng các chữ số là %d:", sum);
    }
}
