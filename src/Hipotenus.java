import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner veri = new Scanner(System.in);

        System.out.print("Karşı kenar uzunluğunu giriniz: ");
        a = veri.nextInt();
        System.out.print("Komşu kenar uzunluğunu giriniz: ");
        b = veri.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println((a>0&&b>0)? "Hipotenüs uzunluğu: "+c+"\nHesaplandı :-)" : "Lütfen sıfırdan büyük değer gitiniz");
    }
}
