public class Main{
    public static void main(String[] args){
        int number=1;
        int sum=0;

        if(number<=1){
            System.out.println(number+" is not a perfect number.");
            return;
        }

        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }

        if(sum==number)
            System.out.println(number+" is a perfect number.");
        else
            System.out.println(number+" is not a perfect number.");
    }
}

