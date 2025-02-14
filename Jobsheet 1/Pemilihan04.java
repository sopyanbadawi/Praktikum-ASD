import java.util.Scanner;
public class Pemilihan04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nTugas, nKuis, nUTS, nUAS;
        double nAkhir;
        String nMutu;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nUAS = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nTugas > 0 && nTugas < 100 && nKuis > 0 && nKuis < 100 && nUTS > 0 && nUTS < 100 && nUAS > 0 && nUAS < 100) {
            nAkhir = ((nTugas * 0.2) + (nKuis * 0.2) + (nUTS * 0.3) + (nUAS * 0.3));
            if (nAkhir > 80) {
                nMutu = "A";
            } else if ( nAkhir > 73 && nAkhir <= 80) {
                nMutu = "B+";
            } else if ( nAkhir > 65 && nAkhir <= 73) {
                nMutu = "B";
            } else if ( nAkhir > 60 && nAkhir <= 65) {
                nMutu = "C+";
            } else if ( nAkhir > 50 && nAkhir <= 60) {
                nMutu = "C";
            } else if ( nAkhir > 39 && nAkhir <= 50) {
                nMutu = "D";
            } else {
                nMutu = "E";
            } 
            System.out.println("Nilai akhir: " + nAkhir);
            System.out.println("Nilai Huruf: " + nMutu);
            System.out.println("==============================");
            System.out.println("==============================");
            if (nAkhir > 50) {
                System.out.println("SELAMAT ANDA LULUS");
            } else{
                System.out.println("MAAF ANDA TIDAK LULUS");
            }

        } else {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        }
    }
}