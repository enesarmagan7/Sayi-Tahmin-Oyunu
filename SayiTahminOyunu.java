package Week2;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 100;
        int sayi = (int) (Math.random() * (max - min + 1)) + min;
        int tahmin;
        int denemeSayisi = 0;
        int kalanHak = 7;
        boolean dogruTahminEdildi = false;

        System.out.println("0 ile 100 arasında bir sayı tahmin edin. Toplam 5 tahmin hakkınız var.");

        while (!dogruTahminEdildi && kalanHak > 0) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;
            kalanHak--;

            if (tahmin < min || tahmin > max) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
            } else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı deneyin. Kalan hak: " + kalanHak);
            } else if (tahmin > sayi) {
                System.out.println("Daha küçük bir sayı deneyin. Kalan hak: " + kalanHak);
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                System.out.println("Tahmininiz " + denemeSayisi + " denemede doğru oldu.");
                dogruTahminEdildi = true;
            }
        }

        if (!dogruTahminEdildi) {
            System.out.println("Tahmin hakkınız bitti. Bilgisayarın seçtiği sayı: " + sayi);
        }


    }
}
