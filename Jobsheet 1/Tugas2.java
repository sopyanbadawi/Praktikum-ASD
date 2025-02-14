import java.util.Scanner;

public class Tugas2 {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        double sisi;
        while (true) {
            System.out.println("=== Kubus ===");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4) : ");
            int pilih = sc.nextInt();
            if (pilih == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.print("Masukkan panjang sisi kubus: ");
                sisi = sc.nextDouble();
                switch (pilih) {
                    case 1:
                        System.out.println("Volume Kubus: " + htgVolume(sisi));
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + htgLuasPermukaan(sisi));
                        break;
                    case 3:
                        System.out.println("Keliling Kubus: " + htgKeliling(sisi));
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }
    static double htgVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    static double htgLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    static double htgKeliling(double sisi) {
        return 12 * sisi;
    }

}

