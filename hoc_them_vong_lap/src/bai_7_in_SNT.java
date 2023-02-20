
import java.util.Scanner;

public class bai_7_in_SNT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào số bất kỳ");
        int i = 2;
        int num = sc.nextInt();

        if (num <= 2) {
            System.out.println(num + "là SNT");
        } else {
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " là SNT");
            } else
                System.out.println(num + " kh là SNT");
//

        }
    }
}
