import java.util.Scanner;

public class gia_tri_trong_mang {
    public static void main(String[] args) {
        int i ;
        String[] hocsinh = {"một","hai","ba","bốn","năm"} ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên học sinh");
        String nhapten = sc.nextLine();
        boolean check = false;
        for ( i = 0; i< hocsinh.length;i++) {
            if (hocsinh[i].equals(nhapten)) {
                System.out.println("vị trí của học sinh trong danh sách"+ nhapten + (i+1));
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.println("không tìm thấy danh sách");
    }
}
