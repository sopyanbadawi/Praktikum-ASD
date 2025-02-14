import java.util.Scanner;
public class Tugas3 {
    static  Scanner sc = new Scanner(System.in);
    static String[] matkul;
    static int[] sks;
    static int[] semester;
    static String[] hari;

    public static void main(String[] args) {
        
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int totMatkul = sc.nextInt();
        sc.nextLine();

        matkul = new String[totMatkul];
        sks = new int[totMatkul];
        semester = new int[totMatkul];
        hari = new String[totMatkul];

        for (int i = 0; i < totMatkul; i++) {
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
                    tampilkanSemuaJadwal(totMatkul);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hariPilihan = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(hariPilihan, totMatkul);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterPilihan = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterPilihan, totMatkul);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = sc.nextLine();
                    carimatkul(nama, totMatkul);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        }
    }
    static void tampilkanSemuaJadwal(int totMatkul) {
        System.out.println("=== Jadwal Kuliah : ===");
        for (int i = 0; i < totMatkul; i++) {
            System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String hariPilihan, int totMatkul) {
        System.out.println("Jadwal Kuliah di hari " + hariPilihan + ":");
        System.out.println("=====================");
        boolean ditemukan = false;
        for (int i = 0; i < totMatkul; i++) {
            if (hari[i].equalsIgnoreCase(hariPilihan)) {
                System.out.println("Mata Kuliah: " + matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            } 
        }
        if (!ditemukan) {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(int semesterPilihan, int totMatkul) {
        System.out.println("Jadwal Kuliah di Semester " + semesterPilihan + ":");
        System.out.println("=====================");
        boolean ditemukan = false;
        for (int i = 0; i < totMatkul; i++) {
            if (semester[i] == semesterPilihan) {
                System.out.println(matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data Tidak Ditemukan");
        }
    }

    static void carimatkul(String nama, int totMatkul) {
        System.out.println("Hasil Pencarian Mata Kuliah " + nama + ":");
        System.out.println("=====================");
        boolean ditemukan = false;
        for (int i = 0; i < totMatkul; i++) {
            if (matkul[i].equalsIgnoreCase(nama)) {
                System.out.println("Mata kuliah: " + matkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
