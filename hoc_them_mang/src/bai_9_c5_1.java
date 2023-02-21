public class bai_9_c5_1 {
    public static void main(String[] args) {
        int[] mang = {1,2,3,4,5};
        bai5(mang);
    }
    public static void bai5(int[] mang) {
//        int[] mang = {1,2,3,4,5};
        int i;

        for ( i = 0; i < mang.length; i++);
        System.out.println(mang[i]);
        //vong lap for//

        for (int j : mang ) {
            System.out.println(j);
            // for each //
        }
    }
}
