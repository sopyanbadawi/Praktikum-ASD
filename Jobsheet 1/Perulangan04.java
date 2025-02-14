import java.util.Scanner;
public class Perulangan04 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Masukkan NIM: ");
            long NIM = sc.nextLong();
              
            int n = (int) (NIM % 100);
            
            if (n < 10) {
                n += 10;
            }
            
            System.out.println("n : " + n);
              
                for (int i = 1; i <= n; i++) {
                    if (i == 6 || i == 10) {
                        continue;
                    }
                    System.out.print((i % 2 == 0) ? (i + " ") : "* ");
                }
            }
}