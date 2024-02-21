import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);

      int number;
      System.out.print("Please enter a number:");
      number=inp.nextInt();

      for(int i=1;i<=number;i++){
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}