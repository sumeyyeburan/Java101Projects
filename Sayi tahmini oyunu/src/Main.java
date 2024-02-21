import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int guess,right=5,wrong=2;

        Random rand=new Random();
        Scanner inp=new Scanner(System.in);

        int number=rand.nextInt(100); // 0 ile 100 arasında rastgele sınıf üret

        System.out.println("\n*** SAYI TAHMİNİ OYUNUNA HOŞ GELDİNİZ! ***\n");
        System.out.println("0 ile 100 arasında bir sayı tuttum.\nTahmin edebilir misin?\n");

        do {
            System.out.print("Tahmininizi giriniz: ");
            guess = inp.nextInt();

             if(guess==number){
                 System.out.println("\nTahmininiz doğru.Kazandınız!");
                 return;
             }
             else{

                 if(guess<number)
                     System.out.println("\nTahmininiz random sayıdan küçüktür!");
                 else
                     System.out.println("\nTahmininiz random sayıdan büyüktür!");

                 System.out.println("\nTekrar deneyin!");
                 right--;
                 System.out.println("Kalan hakkınız: "+right);
                 System.out.println();
             }
         } while(right>0);

         System.out.println("Kaybettiniz!\nRandom sayı: "+number);

    }
}