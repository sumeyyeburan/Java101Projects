import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int number,f1=0,f2=1,f3=0;
        System.out.print("Please enter a number:");
        number=inp.nextInt();

        System.out.print(f1+" "+f2+" ");

        for(int i=1;i<=number-2;i++){
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
    }
}