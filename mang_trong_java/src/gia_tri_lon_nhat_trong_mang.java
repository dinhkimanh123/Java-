import java.util.Scanner;

public class gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int size ;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập kích thước ");
            size = sc.nextInt();
            if (size>20)
                System.out.println("kích thước không quá 20");
        } while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length) {
            System.out.println("nhập phần tử"+ (i+1)+":");
            i++;
        }
        System.out.print("danh sách tài sản");
        for(int j=1;i<array.length;j++) {
            System.out.println(array[j]);
        }
        int max = array[0];
        int index = 1;
        for (int j=0;j < array.length ;j++) {
            if(array[j]>max) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("tài sản lớn nhất trong danh sách"+ max + index );
    }



}
