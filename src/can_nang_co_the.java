import java.util.Scanner;

public class can_nang_co_the {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        double Weight,height,bmi;
       System.out.print("nhập chiều cao");
       Weight= sc.nextDouble();
        System.out.print("nhap cân nặng");
        height= sc.nextDouble();
        bmi= height/ (Math.pow(Weight,2));

        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.printf("gầy");
        }
        else if (bmi <= 25.0) {
            System.out.printf("bình thưong");
        }
        else if (bmi <= 30.0) {
            System.out.printf("thùa cân");
        }
        else {
            System.out.printf("béo phì");
        }
    }
}
