import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int number;
        System.out.print("Please enter a number:");
        number=inp.nextInt();

        int result=polindrome(number);

        if(number==result)
            System.out.println("The number is a Polindrome number.");
        else
            System.out.println("The number is not a Polindrome number.");
    }
    public static int polindrome(int x){
        int reminder,result=0;
        while(x!=0){
            reminder=x%10;
            result=result*10+reminder;
            x=x/10;
        }
        return result;
    }
}