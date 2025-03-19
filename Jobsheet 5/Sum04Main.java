import java.util.Scanner;
public class Sum04Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Sum04 sm = new Sum04(elemen);
    
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Devide and Conquer: " + sm.totalDC(sm.keuntungan,0,elemen-1));        
    }
}