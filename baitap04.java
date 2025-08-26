import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời nhập vào tuổi của bạn");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age <= 0) {
                    System.out.println("Vui lòng nhập 1 số lớn hơn 0");

                }
            } else {
                System.out.println("Vui lòng nhập 1 số lớn hơn 0");
                sc.next();
            }

        }
        while (age <= 0);
        System.out.printf("Tuổi của bạn là %d.", age);
        sc.close();
    }
}
