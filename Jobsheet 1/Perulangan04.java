import java.util.Scanner;
public class Perulangan04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan NIM: ");
        String NIM = sc.nextLine();

        int n = (NIM.charAt(NIM.length() - 2) - '0') * 10 + (NIM.charAt(NIM.length() - 1) - '0');
        System.out.println("n : " + n);


    }
}