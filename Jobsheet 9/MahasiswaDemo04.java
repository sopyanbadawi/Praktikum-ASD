import java.util.Scanner;
public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        int pilihan;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat yang mengumpulkan pertama");
            System.out.println("6. Cek berapa banyak yang mengumpulkan tugas");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("NIlai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua yang mengumpulkan");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    System.out.println("Mahasiswa yang mengumpulkan pertama: ");
                    stack.peekTugasPertama();
                    break;
                case 6:
                    stack.banyakTugas();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            
        } while (pilihan >= 1 && pilihan <= 6);
    }
}
