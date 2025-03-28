import java.util.Scanner;
public class DosenMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen04 list = new DataDosen04();
        Dosen04 dsn[] = new Dosen04[list.dataDosen.length];
        boolean pilihan = true;
        int opsi;
        String gender;

        while (pilihan) {
            System.out.println("--------------------");
            System.out.println("REKAP DATA DOSEN");
            System.out.println("--------------------");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Data berdasarkan Umur (ASC)");
            System.out.println("4. Sorting Data berdasarkan Umur (DSC)");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu: ");
            opsi = sc.nextInt();
            sc.nextLine();

            switch (opsi) {
                case 1:
                    for (int i = 0; i < dsn.length; i++) {
                        if (i >= dsn.length) {
                            System.out.println("Data sudah penuh");
                        } else {
                            System.out.println("--------------------");
                            System.out.println("Dosen ke-" + (i+1));
                            dsn[i] = new Dosen04();
                            System.out.print("Masukkan Kode Dosen: ");
                            dsn[i].kode = sc.nextLine();
                            System.out.print("Masukkan Nama Dosen: ");
                            dsn[i].nama = sc.nextLine();
                            System.out.print("Masukkan Usia: ");
                            dsn[i].usia = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Masukkan Jenis Kelamin (L/P): ");
                            gender = sc.nextLine();
                            if (gender.equalsIgnoreCase("L")) {
                                dsn[i].jenisKelamin = true;
                            } else if (gender.equalsIgnoreCase("P")) {
                                dsn[i].jenisKelamin = false;
                            } else {
                                System.out.println("Jenis Kelamin tidak valid");
                                continue;
                            }
                            list.tambah(dsn[i]);
                        }   
                    }
                    break;
                
                case 2:
                    System.out.println("--------------------");
                    System.out.println("DATA DOSEN");
                    System.out.println("--------------------");
                    list.tampil();;
                    break;
                case 3:
                    System.out.println("--------------------");
                    System.out.println("Sorting Data berdasarkan Umur (ASC)");
                    System.out.println("--------------------");
                    list.SortASC();
                    list.tampil();
                    break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("Sorting Data berdasarkan Umur (DSC)");
                    System.out.println("--------------------");
                    list.SortDSC();
                    list.tampil();
                    break;

                case 5:
                    pilihan = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    break;
            }

        }
    }
}
