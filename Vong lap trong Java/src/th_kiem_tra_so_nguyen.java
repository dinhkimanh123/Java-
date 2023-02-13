import java.util.Scanner;

public class th_kiem_tra_so_nguyen {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào số");
        int num = sc.nextInt();
        if (num < 2 ) {
            System.out.println(num + "không phải số nguyên tố ");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num%1==0) {
                    check = false;
                    break;
                }
                 i++;
            }
            if (check) {
                System.out.println(num + "là số nguyên tố");
            } else {
                System.out.println(num + "không là số nguyên tố ");
            }
        }

    }
}
