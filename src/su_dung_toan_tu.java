import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] arge) {
        float With;
        float height;
        Scanner sc= new  Scanner(System.in);
        System.out.print("nhập chiều dài");
        With = sc.nextFloat();
        System.out.print("nhập chiều cao");
        height = sc.nextFloat();
        float total = With * height ;
        System.out.println("total "+ total);

    }
}
