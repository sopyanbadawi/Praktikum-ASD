import java.util.Scanner;
public class Tugas1 {
    static Scanner sc = new Scanner(System.in); 
    static char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char[][] kota = {
        {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
        {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
        {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
        {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };
    
    public static void main(String[] args) {
        
        tabel();
        inputPlatNomor();
    }
    
    static void tabel(){
        System.out.println("Kode Plat | Nama Kota");
        System.out.println("----------------------");
        for (int i = 0; i < kode.length; i++) {
            System.out.print(kode[i] + " | ");
            for (int j = 0; j < kota[i].length; j++) {
                System.out.print(kota[i][j]);
            }
            System.out.println();
        }
    }

    static void inputPlatNomor(){
        System.out.print("Masukkan Kode Plat Nomor : ");
        char plat = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < kode.length; i++) {
            if ((kode[i]) == plat) {
                System.out.print("Nama Kota : ");
                for (char namaKota : kota[i]) { 
                    System.out.print(namaKota);
                }
            }
        }
    }
}
