import java.util.Scanner;

public class tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laisuat = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số tiền ");
        tien = sc.nextDouble();
        System.out.println("nhập số tháng gửi");
        thang = sc.nextInt();
        System.out.println("nhập lãi suât");
        laisuat = sc.nextDouble();

        double tongtienlai = 0;
        for(int i = 0; i < thang; i++){
            tongtienlai += tien * (laisuat/100)/12 * thang;
        }
        System.out.println(" tổng tiền lãi" + tongtienlai);

    }
}
