import java.util.Scanner;

public class so_ngay_trong_thang {
    public static void main(String[] arge) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhập tháng");
        int month = sc.nextInt();
        String dayMonth = null;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMonth = "31 ngày";
                break;
            case 2:
                dayMonth = "28 or 29 ngay";
        }
        System.out.print(dayMonth);

    }
}
