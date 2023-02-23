import java.util.Arrays;

public class them_phan_tu {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4"};
        System.out.println(Arrays.toString(arr));

        int a = arr.length;
        arr = Arrays.copyOf(arr, a + 1);
        arr[a] = "5";
        System.out.println(Arrays.toString(arr));
    }
}
