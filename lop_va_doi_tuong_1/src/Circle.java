import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    float r;
    float chuvi;
    float dientich;

    void nhapbankinh (){
        System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }
    void tinhChuVi() {
        chuvi = 2 * PI * r;
        System.out.println("Chu vi Hình tròn: " + chuvi);
    }
    void tinhDienTich() {
        dientich = PI * r * r;
        System.out.println("Diện tích Hình tròn: " + dientich);
    }
}




