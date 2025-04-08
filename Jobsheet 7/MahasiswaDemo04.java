import java.util.Scanner;
public class MahasiswaDemo04 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int listMhs = 5;
    MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
    int jumMhs = 5;

    
    for (int i = 0; i < jumMhs; i++) {
        System.out.println("Masukkan data mahasiswa ke-" + (i+1));
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();
        System.out.print("Nama\t: ");
        String nama = sc.nextLine();
        System.out.print("Kelas\t: ");
        String kelas = sc.nextLine();
        System.out.print("IPK\t: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
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

    System.out.println();

    System.out.println("Data mahasiswa setelah sorting berdasarkan IPK menggunakan SELECTION SORT (ASC): ");
    System.out.println("--------------------------");
    list.selectionSort();
    list.tampil();

    System.out.println();

    System.out.println("Data mahasiswa setelah sorting berdasarkan IPK menggunakan INSERTION SORT (ASC): ");
    System.out.println("--------------------------");
    list.insertionSort();
    list.tampil();
    
    System.out.println();

    System.out.println("----------------------------------");
    System.out.println("Pencarian data");
    System.out.println("----------------------------------");
    System.out.println("masukkan ipk mahasiswa yang dicari");
    System.out.print("IPK: ");
    double cari = sc.nextDouble();

    System.out.println("menggunakan sequential searching");
    double posisi = list.sequentialSearching(cari);
    int pss = (int) posisi;
    list.tampilPosisi(cari, pss);
    list.tampilDataSearch(cari, pss);

    }
}
