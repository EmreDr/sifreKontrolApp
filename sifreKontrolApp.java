import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password,onay;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (password.equals("ruhi123") && userName.equals("ruhicenet")) {
            System.out.println("Giriş Yaptınız");
        }else {
            System.out.println("Şifre yanlış yeni şifre oluşturulsun mu Evet/Hayır");
            onay = input.nextLine();
            if (onay.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                password = input.nextLine();
                if (password.equals("ruhi123")) {
                    System.out.println("yeni şifreniz eskisiyle aynı olamaz");
                }else{
                    System.out.println("Şifreniz başarıyla değiştirildi");
                }

            } else if (onay.equals("Hayır")) {
                System.out.println("işlem gerçekleştirilemedi tekrar deneyin.");
            }else {
                System.out.println("eror tekrar deneyin.");
            }
        }





                }
}
