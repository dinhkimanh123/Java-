import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sole;
        int i = 0;
        int j = 10;
        System.out.println("nhap vao so le : ");
        sole = sc.nextInt();
        System.out.println("các số lẻ từ 0 đến " + sole + " là : ");

        for (i = 0; i < 10; i++) {
            if (i == 3 || i == 7) {
                System.out.println("");
            } else if (i % 2 == 1) {
                System.out.println(i + "là số lẻ ");

            }
        }
    }
}


