public class hdong_cua_den_pin {
    public static void main(String[] args) {
        pin pin = new pin();
        den den = new den(false,pin);
        den.chieu();
        den.bat();
        System.out.println("pin con lai:" + pin.getNangluong());


    }


}
class pin {
    public int nangluong = 100;
    public pin (){
    }

    public int getNangluong() {
        return nangluong;
    }

    public void setNangluong(int nangluong) {
        this.nangluong = nangluong;
    }

    public void pinGiam (){
        if (nangluong > 0){
            nangluong--;
            System.out.println(nangluong);
        }else {
            System.out.println("Het oin ");
        }

    }
}
class den {
    public boolean kiemTra;
    public pin pin;
    public void setPin( pin pin){
      this.pin = pin ;
    }

    public pin getPin(){
        return pin;
    }
    public den (boolean kiemTra , pin pin){
        kiemTra = kiemTra;
        this.pin=pin;
    }

    public boolean isKiemTra() {
        return kiemTra;
    }

    public void bat(){
        kiemTra = true;
    }
    public void tat(){
        kiemTra = false;
    }



    public void chieu(){
        if (isKiemTra() && pin.getNangluong() > 0 ){
            System.out.println("den da sang");
            pin.pinGiam();
        }else {
            System.out.println("den da tat ");
        }
    }
}

