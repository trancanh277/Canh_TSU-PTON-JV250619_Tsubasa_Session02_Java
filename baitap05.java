import java.util.Scanner;

public class baitap05 {
    public static void main(String[] args) {
        System.out.println("Mời nhập số tháng cần kiểm tra (1 - 12):");
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ");
        }
    }
}
