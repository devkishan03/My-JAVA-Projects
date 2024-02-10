import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Passwordgenerator {

    public String generatepassword(int n) {
        String num = "1234567890";
        String A = "qwertyuiopasdfghjklzxcvbnm";
        String a = "mnbvcxzlkjhgfdsapoiuytrewq";
        String ch = "!@#$%&";
        String combination = num + A + ch + a;
        String password = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            password += combination.charAt(r.nextInt(combination.length()));
        }
        return password;
    }

    public static void main(String[] args) throws Exception {
        Passwordgenerator p = new Passwordgenerator();
        FileOutputStream fs = new FileOutputStream("Passwords.txt");
        FileInputStream fis = new FileInputStream("Passwords.txt");

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println(
                    "1.Generate password" + "\n" + "2.Show passwords" + "\n" + "3.Exit" + "\n" + "Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("enter the length of a password");
                    int n = sc.nextInt();
                    String passkey = " " + p.generatepassword(n);
                    byte bi[] = passkey.getBytes();
                    fs.write(bi);
                    fs.flush();
                    // fs.write(passkey.getBytes());

                    System.out.println("Your password is:" + passkey);
                    break;
                case 2:
                    byte bo[] = new byte[fis.available()];
                    fis.read(bo);

                    String str = new String(bo);
                    System.out.println(str);
                    break;
                case 3:
                    fis.close();
                    fs.close();
                    sc.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        } while (choice != 3);

    }
}
