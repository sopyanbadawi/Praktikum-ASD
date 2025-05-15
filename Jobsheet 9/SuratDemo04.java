import java.util.Scanner;
public class SuratDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat04 stack = new StackSurat04(5);
        SearchingSurat04 search = new SearchingSurat04();
        int pilihan;

        do {
            System.out.println("\nMenu :");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Masukkan pilihan menu: ");
            pilihan = sc.nextInt();
            System.out.println();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Id Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Masukkan Jenis Surat (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Masukkan Durasi (Jam): ");
                    int durasi = sc.nextInt();
                    Surat04 surat = new Surat04(id, nama, kls, jenis, durasi);
                    stack.push(surat);
                    System.out.printf("Surat atas Nama %s dengan Id %s telah diterima.\n", nama, id);
                    break;
                
                case 2 :
                    Surat04 diverifikasi = stack.pop();
                    if (diverifikasi != null) {
                        System.out.println("Memproses Surat Izin dari " + diverifikasi.namaMahasiswa);
                        if (diverifikasi.jenisIzin == 's' || diverifikasi.jenisIzin == 'S') {
                            System.out.printf("Surat atas Nama %s dengan Id %s telah diverifikasi (Keterangan: Sakit).\n ", diverifikasi.namaMahasiswa, diverifikasi.idSurat);
                        }
                        if (diverifikasi.jenisIzin == 'i' || diverifikasi.jenisIzin == 'I') {
                            System.out.printf("Surat atas Nama %s dengan Id %s telah diverifikasi (Keterangan: Izin).\n", diverifikasi.namaMahasiswa, diverifikasi.idSurat);
                        }
                    }
                    break;
                    
                case 3 :
                    Surat04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Surat terakhir yang masuk adalah dari %s dengan Id Surat %s.\n", lihat.namaMahasiswa, lihat.idSurat);
                    }
                    break;

                case 4 :
                    System.out.print("Masukkan Nama Mahasiswa yang ingin dicari: ");
                    String cari = sc.nextLine();
                    search.cariMahasiswa(cari, stack);
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia.\n");
                    break;
            }

            
        } while (pilihan >= 1 && pilihan <= 4);
        
    }
}