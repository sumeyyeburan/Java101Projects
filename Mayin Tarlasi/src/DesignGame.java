import java.util.Scanner;
import java.util.Random;

public class DesignGame {
    int rowNumber, columnNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner inp = new Scanner(System.in);

    // Constructor: Oyun alanının boyutunu alır ve gerekli değişkenleri başlatır.
    DesignGame(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
        this.size = rowNumber * columnNumber;
    }

    // Oyunu çalıştıran metod.
    public void run() {
        int row, column,success=0;

        // Oyun alanını hazırlar.
        prepareGame();
        // Mayınların konumuyla oluşturulan haritayı ekrana yazdırır.
        print(map);


        System.out.println("\nOyun Başladı !\n");

        while (game) {
            // Oyuncunun seçtiği hücreyi kontrol eder ve sonucu ekrana yazar.
            print(board);

            System.out.println("***************************");
            System.out.print("Satır: ");
            row = inp.nextInt();
            System.out.print("Sütun: ");
            column = inp.nextInt();

            // Girilen koordinatların geçerli olup olmadığını kontrol eder.
            if(row<0 || row>(rowNumber-1)){
                System.out.println("\nGeçersiz koordinat !\n");
                continue;
            }
            if(column<0 || column>(columnNumber-1)){
                System.out.println("\nGeçersiz koordinat !\n");
                continue;
            }


            // Mayın olmayan bir hücre seçilirse, o hücrenin etrafındaki mayınları kontrol eder.
            if (map[row][column] != -1 ) {
                // if(map[row][column]>0){
                //    System.out.println("Girilmiş koordinat\n");
                // }
                // else {
                    check(row, column);
                    success++;
                // }
                // Oyuncu, oyun alanındaki mayınsız hücrelerin tamamını açarsa oyunu kazanır.
                if (success == (size - (size / 4))) {
                    System.out.println("\nOyunu Kazandınız !\n");
                    break;
                }
            }
            else {
                // Mayınlı bir hücre seçilirse oyun kaybedilir.
                game = false;
                System.out.println("\nOyunu kaybettiniz !");
            }
        }
    }

    // Seçilen hücrenin etrafındaki mayın sayısını kontrol eder.
    public void check(int r, int c) {
        if (map[r][c] == 0) {
            if ((c + 1 < columnNumber) && map[r][c + 1] == -1)
                board[r][c]++;
            if ((r + 1 < rowNumber) && map[r + 1][c] == -1)
                board[r][c]++;
            if ((r - 1 >= 0) && map[r - 1][c] == -1)
                board[r][c]++;
            if ((c - 1 >= 0) && map[r][c - 1] == -1)
                board[r][c]++;
        }

        if (board[r][c] == 0) {
            board[r][c] = -2;
        }
    }

    // Oyun alanını mayınlarla hazırlar.
    public void prepareGame() {
        int randRow, randColumn, count = 0;
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randColumn = rand.nextInt(columnNumber);

            if (map[randRow][randColumn] != -1) {
                map[randRow][randColumn] = -1;
                count++;
            }
        }
    }

    // İki boyutlu bir diziyi ekrana yazdırır.
    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

}
