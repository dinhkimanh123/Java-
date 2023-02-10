import java.util.Scanner;

public class doc_chu_thanh_so {
    public static void main(String[] arge) {
    System.out.print("nhập số ");
    Scanner sc= new  Scanner(System.in);
    int num = sc.nextInt();
    int hangdonvi = num %10;
    int hangchuc = (num - hangdonvi)%100;

    int hangtram  = num - hangchuc - hangdonvi;

        System.out.println(num + " " + hangchuc + " " + hangdonvi + " " +  hangtram);
    if  (hangtram > 0) {
        switch (hangtram) {
            case 100:
                System.out.print("one hundred");
                break;
            case 200:
                System.out.print("two hundred");
                break;
            case 300:
                System.out.print("three hundred");
                break;
            case 400:
                System.out.print("four hundred");
                break;
            case 500:
                System.out.print("five hundred");
                break;
            case 600:
                System.out.print("six hundred");
                break;
            case 700:
                System.out.print("seven hundred");
                break;
            case 800:
                System.out.print("eight hundred");
                break;
            case 900:
                System.out.print("nine hundred");
                break;

        }
    }


    if ( num > 9 && num < 20 ) {
        switch (num) {
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            case 13:
                System.out.print("Thirteen");
                break;
            case 14:
                System.out.print("Fourteen");
                break;
            case 15:
                System.out.print("Fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("Seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;

        }
    } else {
        switch (hangchuc) {
            case 20:
                System.out.println("twenty");
                break;
            case 30:
                System.out.print("thirty");
                break;
            case 40:
                System.out.print("fourty");
                break;
            case 50:
                System.out.print("fifty");
                break;
            case 60:
                System.out.print("sixty");
                break;
            case 70:
                System.out.print("seventy");
                break;
            case 80:
                System.out.print("eighty");
                break;
            case 90:
                System.out.print("ninety");
                break;
        }

        if (hangdonvi < 10 && hangdonvi > 0) {
            switch (hangdonvi) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("Eroll");
            }
        }
    }
}
}


