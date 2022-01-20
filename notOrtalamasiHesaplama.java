//import deyimini kullanarak util kütüphanesinden scanner sınıfını dahil etmemiz gerekiyor
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 1. kullanıcıdan alınacak değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        // 2. Bu noktada kullanıcıdan değer almak için bir scanner sınıfı oluşturmak gerekiyor
        //scanner sınıfını kullanabilmek için bir nesne üretmemiz gerekiyor
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : " );
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + sonuc);
        //stringlerde yani metin karakterlerinde + işareti kullanılarak print ederken yan yana yazar

        //buradan sonra elde ettiğimiz ortalama eğer 60'dan küçükse ekranda kaldınız yazacak eğer büyükse geçtiniz yazacak.
        boolean ortalama = sonuc < 60 ;
        String str = ortalama ? "Kaldınız" : "Geçtiniz";
        System.out.println(str);
        // boolean olarak belirlediğimiz 'ortalama' değişkeni koşulu sağlıyorsa ekrana 'Kaldınız' sağlamıyorsa ekrana 'Geçtiniz' yazar.




        }
        }
