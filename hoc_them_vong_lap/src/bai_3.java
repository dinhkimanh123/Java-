import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sochan;
        int i = 0;
        int j = 10;
        System.out.println("nhap vao so chan : ");
        sochan = sc.nextInt();
        System.out.println("các số chẵn từ 0 đến " + sochan + " là : ");

        for (i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("");
            } else if (i % 2 == 0) {
                System.out.println(i + "là số chẵn ");

            }
        }
    }
}
