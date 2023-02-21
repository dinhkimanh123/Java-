public class bai_9_c3_1 {
    public static void main(String[] args) {
        int[] mang = {3, 4, 5, 6, 7, 8, 9, 10};
        bai3(mang);
    }
    public static void bai3(int[] mang) {
        //duyệt mảng//
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
            //vong lap for//
        }
        for (int j : mang) {
            System.out.println(j);
            //vong for each//
        }
    }
}
