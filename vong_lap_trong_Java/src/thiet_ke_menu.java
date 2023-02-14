import java.util.Scanner;

public class thiet_ke_menu {
    public static void main(String[] args) {
        int luachon;
        Scanner sc = new Scanner(System.in);

        System.out.println("menu");
        System.out.println("1.vẽ hình tam giác");
        System.out.println("2.vẽ hình vuông");
        System.out.println("3.vẽ hình chữ nhật");
        System.out.println("0.thoát");
        System.out.println("nhập lựa chọn");
        luachon = sc.nextInt();

        switch (luachon) {
            case 1:
                System.out.println("hình tam giác");
                System.out.println("* * * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * ");
                System.out.println("* * * ");
                System.out.println("* * ");
                System.out.println("*");
                break;
            case 2:
                System.out.println("hình vuông");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 3:
                System.out.println("hình chữ nhật");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 0:
                System.out.println("thoát");
            default:
                System.out.println("không có lựa chọn");

        }


    }
}
