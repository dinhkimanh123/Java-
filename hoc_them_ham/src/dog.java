public class dog {
    // tạo các biến //
    String giongloai;
    String kicthuoc;
    int tuoi;
    String mau;

    // pthuc lấy thong tin //
    public String getInfo() {
        return ("giongloai is :" + giongloai + "\n kichthuoc is :" + kicthuoc + "\n tuoi is :" + tuoi + "\n mau is :" + mau);

    }

    public static void main(String[] args) {
        // tạo con chó giống poodle //
        dog poodle = new dog();
        // gán đặc điểm cho con chó //
        poodle.giongloai = "poodle";
        poodle.kicthuoc = "small";
        poodle.tuoi = 2;
        poodle.mau = "yellow";

        // in ra thông tin con cho //
        System.out.println(poodle.getInfo());

    }
}
