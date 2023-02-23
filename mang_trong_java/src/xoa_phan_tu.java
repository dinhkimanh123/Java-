import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
     int n;
     int i;
     int c;
     Scanner sc= new Scanner(System.in);
     do {
         System.out.println("nhập vào giá trị");
         n = sc.nextInt();
     }while (n < 0);

     int[] a = new int[n];
        System.out.println("nhập phần tử cho mảng");
        for (i=0 ; i<n ; i++) {
            System.out.println("nhập phần tử thu: " + i + ":");
            a[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        System.out.println("nhập số nguyên N");

        for (c = i = 0; i < n; i++) {
            if (a[i] != N) {
                a[i] = a[i] ;
                c++;
            }
        }
        n = c ;
        System.out.println("mảng còn lại trong phần tử là ;" + N);
         for (i=0; i<n; i++){
             System.out.println(a[i]);
         }
    }










}

