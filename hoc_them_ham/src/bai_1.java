import java.util.Arrays;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        int n;
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        Scanner sc= new Scanner(System.in);
        System.out.print("nhập số n = ");
        n = sc.nextInt();

        if(check(arr,n)) {
            System.out.println("có tồn tại trong mảng ");
        } else {
            System.out.println("không tồn tại trong mảng");
        }
        daonguoc(arr);
        gtrinhonhat(arr);
    }

    public static boolean check(int[] songuyen, int n ) {
        boolean ketqua = false ;

        for (int i = 0; i <songuyen.length;i++) {
            if (songuyen[i] == n ) {
                ketqua = true;
            }
        }
        return ketqua;
    }

//    bai 2 : đảo ngược
    public static void daonguoc(int[] arr) {
        for (int i =0, j = arr.length - 1; i < j; i++,j--) {
            int dao = arr[i];
            arr[i] = arr[j];
            arr[j] = dao;
        }
        System.out.println(Arrays.toString(arr));
    }


    // bai 3: tìm giá trị nhỏ nhất
    public static void gtrinhonhat (int[] arr) {
       int min  = arr[0];
       for (int i = 0; i < arr.length ; i++ ) {
           if(min > arr[i]) {
               min = arr[i];
           }
       }
        System.out.println("giá trị nhỏ nhất trong mảng là : " + min);
    }

    public static void timsonguyen (int[] arr) {


    }
}










