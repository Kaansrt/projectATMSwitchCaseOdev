import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select=0;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userName = inp.nextLine();
            System.out.print("Parola giriniz : ");
            password=inp.nextLine();
            if (userName.equals("kaan") && password.equals("asd123")) {
                System.out.println("Atm Sistemine Hoşgeldiniz !!");
                do {
                    System.out.println("1 - Para Yatırma\n2- Para Çekme\n3 - Bakiye Sorgulama\n4 - Çıkış Yap");
                    System.out.print("Yapılacak İşlem Numarası : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Tutarı giriniz : ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Çekilecek Tutarı giriniz : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz Bakiye.");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiye : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;


            } else {
                right--;
                System.out.println("Kullanıcı adı veya Parola hatalı. Tekrar Deneyiniz!!!");
                if (right == 0) {
                    System.out.println("3 Hakkınız da bitmiştir. Hesap Bloke olmuştur.");
                } else {
                    System.out.println("Hakkınız : "+ right);
                }
            }
        }
    }
}