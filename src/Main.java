import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcının manavdan aldığı ürünlerin kilogram değerlerine göre toplam tutarı veren program.
        double a  ,e ,d ,m ,p ,toplam;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        a = input.nextDouble();
        a *= 2.14;
        System.out.println("Elma Kaç Kilo ? :");
        e = input.nextDouble();
        e *= 3.67;
        System.out.println("Domates Kaç Kilo ? : ");
        d = input.nextDouble();
        d *= 1.11;
        System.out.println("Muz Kaç Kilo ? :");
        m = input.nextDouble();
        m *= 0.95;
        System.out.println("Patlıcan Kaç Kilo ? : ");
        p = input.nextDouble();
        p *= 5.00;
        toplam = a+e+d+m+p;
        System.out.println("Toplam tutar : " +toplam);

    }

}