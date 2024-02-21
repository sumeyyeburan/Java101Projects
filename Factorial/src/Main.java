import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        int number,factorial=1;
        System.out.print("Please enter a number:");
        number=inp.nextInt();

        if(number<0){
            System.out.println("Invalid input");
            return;
        }

        if(number==0){
            System.out.println(number+"!="+factorial);
            return;
        }

        for(int i=1;i<=number;i++){
            factorial*=i;
        }

        System.out.println(number+"!="+factorial);
    }
}