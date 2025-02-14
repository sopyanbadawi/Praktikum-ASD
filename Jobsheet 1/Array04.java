import java.util.Scanner;
public class Array04 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrogramanan",
            "Praktikum Dasar Pemrogramanan",
            "Keselamatan Kerja dan Kesehatan Kerja"
        };
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        double totalBobot = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0; 
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
            totalBobot += bobotNilai[i];
        }
        double ip = totalBobot/mataKuliah.length;

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.println("MK                                      Nilai Angka   Nilai Huruf   Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
        System.out.printf("%-40s %-12.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ip);
    }
}
