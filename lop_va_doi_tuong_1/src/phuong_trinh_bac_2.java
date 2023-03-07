import java.util.Scanner;

public class phuong_trinh_bac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        System.out.println("nhập c");
        c = sc.nextInt();

        phuong_trinh_bac_2 phuongTrinh1 = new phuong_trinh_bac_2(a,b,c);
        if (phuongTrinh1.getDalta() > 0){
            System.out.println("pt có 2 nghiệm phân biệt ");
            System.out.println("nghiệm x1 = " + phuongTrinh1.getPtrinh1() + "x2 =" + phuongTrinh1.getPtrinh2());
        } else if (phuongTrinh1.getDalta() == 0 ){
            System.out.println("pt có nghiệm kép");
            System.out.println("x1 = x2 "+phuongTrinh1.getPtrinh());
        } else {
            System.out.println("pt vô nghiệm ");
        }
    }

    public int a;
    public int b;
    public int c;

    public phuong_trinh_bac_2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPtrinh(){
        return -b / (2*a);
    }
    public double getDalta(){
        return Math.pow(b, 2) - 4 * a * c ;
    }
    public double getPtrinh1(){
        double delta = getDalta();
        return (-b + Math.pow(delta, 0.5))/(2*a);
    }
    public double getPtrinh2(){
        double delta = getDalta();
        return (-b - Math.pow(delta, 0.5))/(2*a);
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c ;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
}
