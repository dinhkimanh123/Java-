import java.util.Scanner;

public class bai_2 {
// bài 1 :  Khai báo 1 mảng gôm 10 phần tử và nhập giá trị lần lượt cho 10 phần tử vừa tạo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("nhập độ dài");
        i = 10;
        int[] a = new int[i];

        for (i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println("giá trị từng phần tử " + (i + 1) + ":" + a[i]);
        }


        // bài 2 + 3 : tính tổng các phần tử thứ 1 3 5 7 9 trong mảng vừa tạo, 1 3 7 9

        int[] chuoi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tong = 0;
        for (int j = 0; j < chuoi.length; j++) {
            if (j == 5) {
                continue;
            }
            if (j % 2 != 0) {
                tong += chuoi[j];
            }
        }
        System.out.println("tổng các số 1,3,5,7,9 là :" + tong);


        // bài 4 :  viết hàm tính tích của phần tử 2, 4 và 9 của phần tử vừa tạo

            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int x = 1;
            for (int k = 0; k < 10; k++) {
                if (array[k]==2||array[k]==4||array[k]==9) {
                    x = x * array[k];
                }
            }

            System.out.println("Tich cac so 2 4 9: "+ x);
        }
}



















