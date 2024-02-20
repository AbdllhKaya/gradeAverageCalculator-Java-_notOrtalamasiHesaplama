import java.util. Scanner;
public class Main {
    public static void main(String[] args) {

      //Scanner class has been defined.
      Scanner input= new Scanner(System.in);

      //Variables have been initialized.
      int mat,fizik,kimya,turkce, tarih, muzik;

      //Get values from the user.
      System.out.print("Matematik notunuzu giriniz=");
      mat= input.nextInt();

      System.out.print("Fizik notunuzu giriniz=");
      fizik= input.nextInt();

      System.out.print("Kimya notunuzu giriniz=");
      kimya= input.nextInt();

      System.out.print("Türkçe notunuzu giriniz=");
      turkce= input.nextInt();

      System.out.print("Tarih notunuzu giriniz=");
      tarih=input.nextInt();

      System.out.print("Müzik notunuzu giriniz=");
      muzik=input.nextInt();

      int sonuc = (mat+fizik+kimya+turkce+ tarih+ muzik)/6;
      System.out.println("Not ortalamanız="+sonuc);

      // The logical evaluation of the arithmetic operation was performed.
      boolean b = sonuc >= 60.0 ;

      String str = b ? "GEÇTİNİZ! TEBRİKLER!" : "KALDINIZ!";
      System.out.println(str);

    }
}