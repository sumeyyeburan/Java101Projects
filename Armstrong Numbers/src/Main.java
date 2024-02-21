import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int number,digit=1,reminder,result=0;
        System.out.print("Please enter a number:");
        number=inp.nextInt();

        int temp=number;
        while(temp/10>0){
            digit++;
            temp=temp/10;
        }

        temp=number;
        while(temp>0){
            reminder=temp%10;
            int sum=1;
            for(int i=1;i<=digit;i++){
                sum=sum*reminder;
            }
            result=result+sum;
            temp=temp/10;
        }

        if(number==result)
            System.out.println("The number is an Armstrong number.");
        else
            System.out.println("The number is not an Armstrong number.");
    }
}