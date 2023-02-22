import java.util.Arrays;
import java.util.Scanner;

public class b1_do_dai_mang {
    //bai 1//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i; ;
        int sum = 0;
        System.out.println("nhập độ dài");
        i = 5;
        int[] a = new int[i];


        for (i = 0; i<a.length;i++){
            a[i] = i ;
            System.out.println("giá trị từng phần tử "+(i+1)+": " + a[i]);

        }
    //bai 2//
        for (i=0;i<a.length;i++) {
            sum = sum + a[i];
        }
        System.out.println("kết quả là :"+ sum );
    //bai 3//
        for ( int j : a
             ) {
            System.out.print(j);
        }

    //bai 4//
        int max = a[0];
        for (int j = 0;j<a.length;j++) {
            if(a[j] > max) {
                max = a[j];
            }
        }
        System.out.println("giá trị lớn nhất là :" + max );
    }
}
