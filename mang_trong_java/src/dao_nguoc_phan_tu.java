import java.util.Scanner;

public class dao_nguoc_phan_tu {
    public static void main(String[] args) {
        int size ;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập kích thước");
            size = sc.nextInt();
            if (size<20)
                System.out.println("kích thước không vựơt qua 20");
        } while (size>20) ;
        array = new int [size];
        int i = 0 ;
        while (i<array.length) {
            System.out.println("nhập phần tử" + (i+1) + ":");
            array[i] = sc.nextInt();
            i++;

        }
        System.out.println("các phần tử trong mảng");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        for (int j = 0; j <array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j ];
            array[size - 1 - j] = temp;
        }
        System.out.println("mảng đảo ngược");
        for (int j = 0; j<array.length; j++) {
            System.out.print(array[j]);
        }
    }
}
