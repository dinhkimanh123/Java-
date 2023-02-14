import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số a");
        a = sc.nextInt();
        System.out.println("nhập số b");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a==0 || b==0 ) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ước chung lớn nhất" + a );
    }
}
