public class bai_3 {
    public static void main(String[] args) {
        //duyệt mảng//
        int[] mang = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<mang.length;i++) {
            System.out.println(mang[i]);
            //vong lap for//
        }
        for (int j  : mang ) {
            System.out.println(j);
            //vong for each//
        }
    }
}

