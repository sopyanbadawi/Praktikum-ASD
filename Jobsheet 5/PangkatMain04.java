import java.util.Scanner;
public class PangkatMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Pangkat04[] png = new Pangkat04[elemen];

        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat04(basis, pangkat);
        }

        System.out.println();
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat04 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println();
        System.out.println("HASIL PANGKAT DEVIDE AND CONQUER: ");
        for (Pangkat04 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
