public class Main{
    public static void main(String[] args){
        int number=-1;
        /*
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }

        for(int i=2;i<number;i++){
            if(number%i==0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
        */

        boolean isPrime=true;

        if(number<0) {
            System.out.println("Invalid input!");
            return;
        }

        if (number <= 1){
           isPrime=false;
        }

        for(int i=2;i<number;i++){
            if(number%i==0) {
                isPrime=false;
            }
        }

        if(isPrime)
            System.out.println(number + " is a prime number.");
        else
           System.out.println(number + " is not a prime number.");

    }
}

