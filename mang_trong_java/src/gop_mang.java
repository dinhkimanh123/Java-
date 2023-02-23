import java.util.Arrays;

public class gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int dodaimang = arr1.length + arr2.length;
        int[] ketqua = new int[dodaimang];
        int i = 0;

        for (int a:arr1
             ) { ketqua[i] = a;
            i++;
        }
        for ( int a:arr2
             ) { ketqua[i] = a;
            i++;
        }
        System.out.println(Arrays.toString(ketqua));
        
    }
}
