import java.util.Scanner;

/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/

public class ortalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner sınıfımızı tanımladık
        int mat,fizik,kimya,trk,tarih,muzik,toplam;  //değişkenlerimizi tanımladık
        double ortalama;
        String durum;
        System.out.print("Matematik Notunuzu Giriniz.");  //Kullanıcıdan istediğimiz msj
        mat = input.nextInt();                            //Kullanıcıdan veri istedik
        System.out.print("Fizik Notunuzu Giriniz.");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz.");
        kimya = input.nextInt();
        System.out.print("Turkce Notunuzu Giriniz.");
        trk = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz.");
        tarih = input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz.");
        muzik = input.nextInt();

        toplam = mat + fizik + kimya + trk + tarih + muzik;
        ortalama = toplam / 6;
        System.out.println("Derslerinizin Ortalama Sonucu" + ortalama);

        durum = (ortalama >= 60) ? "Gectiniz" : "Kaldiniz";
        System.out.print(durum);
    }
}

