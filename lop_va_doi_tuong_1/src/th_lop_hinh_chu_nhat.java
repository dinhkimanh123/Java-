import java.util.Scanner;

public class th_lop_hinh_chu_nhat {
    double width ;
    double height;
    public th_lop_hinh_chu_nhat() {
    }
    public th_lop_hinh_chu_nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getdientich () {
        return this.width * this.height ;
    }
    public double getchuvi () {
        return (this.width + this.height) * 2;
    }
    public String display (){
        return "th_lop_hinh_chu_nhat {" + "width =" +  width + "height = " + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        double width = sc.nextDouble();
        System.out.println("nhập chieuu rộng");
        double height = sc.nextDouble();

        th_lop_hinh_chu_nhat hcn  = new th_lop_hinh_chu_nhat(width,height);
        System.out.println("HCN của bạn  là : " + hcn.display());
        System.out.println("chu vi HCN của bạn là : " + hcn.getchuvi());
        System.out.println("diện tích HCN của bạn là :" + hcn.getdientich());


        }
    }

