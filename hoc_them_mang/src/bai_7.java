public class bai_7 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i =0 ; i< arr.length;i++) {
            arr[i] = i;
        }
        for (int j : arr){
            System.out.println(j);
        }
    }
}
