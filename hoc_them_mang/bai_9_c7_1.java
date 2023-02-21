public class bai_9_c7_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bai7(arr);
    }
    public static void bai7(int[] arr) {

        for (int i =0 ; i< arr.length;i++) {
            arr[i] = i;
        }
        for (int j : arr){
            System.out.println(j);
        }
    }
}
