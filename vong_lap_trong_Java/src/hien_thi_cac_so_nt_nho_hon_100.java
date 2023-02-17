public class hien_thi_cac_so_nt_nho_hon_100 {

        public static void main(String[] args) {
            int n,count = 0;
            int status = 1;
            int num = 3;
            System.out.println("số nguyên tố nhỏ hơn 100 là: ");
            System.out.println(2);
            for (int i = 2; i <= 50;){
                for (int j = 2; j <= Math.sqrt(num); j++){
                    if (num%2 == 0){
                        status = 0;
                        break;
                    }
                }
                if (status != 0){
                    System.out.println("các số nguyên tố sau " + count + " là: " + num);
                    i++;
                    count ++;

                }
                status = 1;
                num ++;
            }
        }
    }

