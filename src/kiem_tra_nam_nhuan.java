import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year;
        System.out.print("nhập vào năm");
        year =sc.nextInt();
        if (year %4==0) {
            if ( year %100 ==0) {
                if (year %400 ==0) {
                    System.out.print("Là năm nhuận ");
                }
                else {
                    System.out.print("Ko là năm nhuận");
                }
            } else {
                System.out.print("là năm nhuận");
            }
        } else {
            System.out.print("không là năm nhuận ");
        }


    }
}
