import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int a,b,EBOB=1,EKOK;
        System.out.print("Please enter two numbers:");
        a=inp.nextInt();
        b=inp.nextInt();

        int min=(a>b)?b:a;

        for(int i=1;i<min;i++){
            if(a%i==0 && b%i==0){
                EBOB=i;
            }
        }
        System.out.println("EBOB="+EBOB);

        EKOK=(a*b)/EBOB;
        System.out.println("EKOK="+EKOK);
    }
}