import java.util.Scanner;
public class MahasiswaDemo04 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();

    int jmlMahasiswa;
    System.out.print("Masukkan banyak data mahasiswa yang ingin disimpan: ");
    jmlMahasiswa = sc.nextInt();
    
    for (int i = 0; i < jmlMahasiswa; i++) {
        System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
        sc.nextLine();
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Kelas\t: ");
        String kelas = sc.nextLine();
        System.out.print("IPK\t: ");
        double ipk = sc.nextDouble();
        System.out.println("--------------------------");

        Mahasiswa04 m = new Mahasiswa04(nim, nama, kelas, ipk);
        list.tambah(m);
    }


    
    System.out.println("Data mahasiswa sebelum sorting: ");
    System.out.println("--------------------------");
    list.tampil();

    System.out.println();
    
    System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
    System.out.println("--------------------------");
    list.bubbleSort();
    list.tampil();
    }
}
