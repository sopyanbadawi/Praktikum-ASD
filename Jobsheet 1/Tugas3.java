import java.util.Scanner;
public class Tugas3 {
    static  Scanner sc = new Scanner(System.in);
    static String[] matkul;
    static int[] sks;
    static int[] semester;
    static String[] hari;

    public static void main(String[] args) {
        
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        matkul = new String[n];
        sks = new int[n];
        semester = new int[n];
        hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan untuk Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            matkul[i] = sc.nextLine();
            System.out.print("SKS : ");
            sks[i] = sc.nextInt();
            System.out.print("Semester : ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari : ");
            hari[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Tampilkan Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    tampilkanSemuaJadwal(n);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hariPilihan = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(hariPilihan, n);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterPilihan = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterPilihan, n);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = sc.nextLine();
                    carimatkul(nama, n);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        }
    }
    static void tampilkanSemuaJadwal(int n) {
        System.out.println("=== Jadwal Kuliah : ===");
        for (int i = 0; i < n; i++) {
            System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String hariPilihan, int n) {
        System.out.println("Jadwal Kuliah di hari " + hariPilihan + ":");
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            if (hari[i].equalsIgnoreCase(hariPilihan)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
            }else {
               System.out.println("Data Tidak Ditemukan"); 
            }
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(int semesterPilihan, int n) {
        System.out.println("Jadwal Kuliah di Semester " + semesterPilihan + ":");
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            if (semester[i] == semesterPilihan) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
            }else {
                System.out.println("Data Tidak Ditemukan"); 
            }
        }
    }

    static void carimatkul(String nama, int n) {
        System.out.println("Hasil Pencarian Mata Kuliah " + nama + ":");
        System.out.println("=====================");
        for (int i = 0; i < n; i++) {
            if (matkul[i].equalsIgnoreCase(nama)) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
            }else {
                System.out.println("Data Tidak Ditemukan"); 
            }
        }
    }
}
