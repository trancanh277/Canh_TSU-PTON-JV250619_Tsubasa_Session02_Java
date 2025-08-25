import java.util.Scanner;
public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("n không phải số chẵn cũng không phải số lẻ");
        } else if (n % 2 == 0) {
            System.out.println("n là số chẵn");
        }
        else {
            System.out.println("n là số lẻ");
        }
    }
}