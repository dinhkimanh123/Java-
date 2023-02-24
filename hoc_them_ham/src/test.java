import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        int[]arr = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số n ");
        n = sc.nextInt();

        if(check(arr,n)) {
            System.out.println("có tồn tại trong mảng");
        }else {
            System.out.println("không tồn tại trong mảng");
        }

    }
    public static boolean check(int[] arr, int n ){
        boolean ketqua = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == n ) {
                ketqua = true;
            }
        }
        return ketqua;
    }
}
