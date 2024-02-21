import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int row,column;

        System.out.println("\n*** MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ! ***\n");

        // Kullanıcıya oyunun boyutunu girmesini söyleyen bir mesaj.
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.print("Satır sayısı: ");
        row=inp.nextInt();
        System.out.print("Sütun sayısı: ");
        column=inp.nextInt();
        System.out.println();

        // Oyun alanının boyutunu belirleyen ve oyunu başlatan DesignGame sınıfının bir örneği oluşturulur.
        DesignGame game = new DesignGame(row, column);

        // Oyun çalıştırılır.
        game.run();
    }
}