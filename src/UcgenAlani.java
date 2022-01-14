import java.text.DecimalFormat;
import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int a,b,c;
        Scanner uzunluk = new Scanner(System.in);

        System.out.print("1. kenar uzunluğu: ");
        a = uzunluk.nextInt();
        System.out.print("2. kenar uzunluğu: ");
        b = uzunluk.nextInt();
        System.out.print("3. kenar uzunluğu: ");
        c = uzunluk.nextInt();

        double u = (a+b+c)/2;

        System.out.println((a>0&&b>0&&c>0) ? "Üçgenin alanı: "+Math.sqrt(u*(u-a)*(u-b)*(u-c)) : "Sıfırdan büyük değer giriniz");

    }
}
