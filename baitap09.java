import java.util.Scanner;

public class baitap09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Mời nhập vào số nguyên dương n:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if(n > 0) {
                    break;
                } else {
                    System.out.println("Số nhập vào không hợp lệ");
                }
            } else {
                System.out.println("Số nhập vào không hợp lệ");
                sc.next();
            }
        }
        System.out.println("Các số Armstrong từ  0 đến" + n );
        for(int i = 1; i <= n; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isArmstrong(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit,k);
            temp = temp / 10;
        }
        return  sum == num;
    }
}


