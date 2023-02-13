import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int with = 5;
        int height = 3;

        int j;
        Scanner sc = new Scanner(System.in);

        System.out.println("height");
        height = sc.nextInt();
        System.out.println("with");
        with = sc.nextInt();

        for (int i=0; i<=height; i++) {
            for (j=0; j<=with; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
} 

