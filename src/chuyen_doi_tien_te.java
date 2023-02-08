import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main (String[] arge) {
        double vnd = 23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhập số tiền usd cần đổi");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("giá trị vnd:" + quydoi);

    }
}
