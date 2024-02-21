import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        // Kullanılacak değişkenlerin tanımlanması
        String userName,password;
        int balance=2700,right=3,select;

        // 3 kullanıcı adı ve şifre kontrolü için döngü
        while(right>0){

            // kullanıcı adı ve şifrenin alınması
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName=inp.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password=inp.nextLine();

            // kullanıcı adı ve şifrenin doğruluğunun kontrol edilmesi
            if(userName.equals("Sümeyye Buran") && password.equals("Sümeyye.27")){
                System.out.println("\nBaşarılı bir şekilde giriş yaptınız !\n");

                // ATM işlemleri menüsü
                do{
                    // yapılacak işlemlerin seçimi
                    System.out.println("1-Bakiye Sorgulama\n2-Para Çekme\n3-Para Yatırma\n4-Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select=inp.nextInt();


                    switch(select){
                        case 1:
                            // bakiye sorgulama
                            System.out.println("\nMevcut bakiyeniz: "+balance+"TL");
                            System.out.println();
                            break;
                        case 2:
                            // para çekme
                            int price;
                            System.out.print("\nLütfen para miktarını giriniz: ");
                            price=inp.nextInt();

                            // istenilen tutarın mevcut bakiye ile sorgulanması
                            if(price<=balance){
                                System.out.println("\nBaşarılı bir şekilde "+price+"TL çektiniz !");
                                balance=balance-price;
                                System.out.println();
                            }
                            else {
                                System.out.println("\nYetersiz bakiye!");
                                System.out.println();
                            }
                            break;
                        case 3:
                            // para yatırma
                            int cash;
                            System.out.print("\nLütfen yatırmak istediğiniz para miktarını giriniz: ");
                            cash=inp.nextInt();

                            balance=balance+cash;

                            System.out.println("\nBaşarılı bir şekilde "+cash+"TL yatırdınız !");
                            System.out.println();
                            break;
                        case 4:
                            // çıkış işlemi
                            System.out.println("\nBaşarılı bir şekilde çıkış yaptınız !");
                            System.out.println();
                            System.exit(0);
                            break;
                        default:
                            //geçersiz veri girme
                            System.out.println("\nGeçersiz işlem seçimi !");
                            System.out.println();
                            break;
                    }
                }while(true);

            }
            // Kullanıcı adı veya şifre yanlışsa
            else {
                right--;
                if(right==0){
                    System.out.println("\nHesabınız bloke olmuştur.Lütfen bankanız ile iletişime geçiniz!");
                }
                else {
                    System.out.println("\nKullanıcı adı veya parolanız yanlış.Tekrar deneyiniz !"+"\nKalan hakkınız : "+ right );
                    System.out.println();
                }
            }

        }
    }
}