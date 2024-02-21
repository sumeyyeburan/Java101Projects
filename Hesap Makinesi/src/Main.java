import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        int a,b,operation;
        double result;

         while(true){
             System.out.print("Enter 1 for +\nEnter 2 for -\nEnter 3 for *\nEnter 4 for /\nEnter 0 for Exit\nYour choice:");
             operation= inp.nextInt();

             if(operation==0)
                 break;

             System.out.println("Please enter two numbers:");
             a= inp.nextInt();
             b=inp.nextInt();

              switch(operation){
                  case 1:
                      result=a+b;
                      System.out.println(a+"+"+b+"="+result);
                      break;
                  case 2:
                      result=a-b;
                      System.out.println(a+"-"+b+"="+result);
                      break;
                  case 3:
                      result=a*b;
                      System.out.println(a+"*"+b+"="+result);
                      break;
                  case 4:
                      if(b!=0){
                          result=(double)a/b;
                          System.out.println(a+"/"+b+"="+result);
                      }
                      else
                          System.out.println("Undefined!");
                      break;
                  default:
                      System.out.println("Invalid Input!");

              }
              System.out.println("**************************");
         }
    }
}