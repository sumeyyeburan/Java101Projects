import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int number;
        double harmonic=0.0;
         System.out.print("Please enter a number:");
         number= inp.nextInt();

         for(int i=1;i<=number;i++){
             harmonic=harmonic+(1.0/i);
         }

         System.out.println("The harmonic number is "+harmonic);
    }
}