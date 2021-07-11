
import java.util.Scanner;

public class Veri {
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    //   System.out.print("Lütfen yaşınızı giriniz:");
     //  int yas = scanner.nextInt();
    //   System.out.println("Girilen Yaş Değeri = "+yas);
       System.out.println("");
       System.out.print("Lütfen Adınızı Giriniz:");
       String isim = scanner.nextLine();
       System.out.println("Kullanıcının Adı = "+isim);
       System.out.print("Lütfen bir sayı giriniz:");
       byte sayi = scanner.nextByte();
       System.out.println("Girilen sayı= "+sayi);
       System.out.print("Lütfen boyunuzu giriniz(metre cinsinden):");
       double boy = scanner.nextDouble();
       System.out.println("Boy uzunluğunuz(metre cinsinden) = "+boy);
      
       
       
       
    
}
  
}
