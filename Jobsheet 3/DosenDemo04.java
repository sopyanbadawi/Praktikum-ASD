import java.util.Scanner;
public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, kode;
        Boolean jenisKelamin;
        int usia;

        
        int allDosen;
        System.out.print("Masukkan banyak data Dosen yang ingin didata: ");
        allDosen = sc.nextInt();
        Dosen04[] arrayDosen = new Dosen04[allDosen];
        DataDosen04 arrayDataDosen04 = new DataDosen04();


        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode\t\t: ");
            kode = sc.next();
            System.out.print("Nama\t\t: ");
            nama = sc.next();
            System.out.print("Masukkan jenis kelamin ('true' untuk Pria, 'false' untuk Perempuan) : ");
            jenisKelamin = sc.nextBoolean();
                if (jenisKelamin) {
                    System.out.println("Jenis Kelamin\t: Pria");
                } else {
                    System.out.println("Jenis Kelamin\t: Perempuan");
                }
            System.out.print("Masukkan Usia Dosen: ");
            usia = sc.nextInt();
            arrayDosen[i] = new Dosen04(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------------------------------------------------");
            
        }

        
        int n = 1;
        for (Dosen04 allData : arrayDosen) {
            System.out.println("Data Dosen ke-" + n++);
            System.out.println("Kode Dosen: " + allData.kode );
            System.out.println("Nama Dosen: " + allData.nama );
            System.out.println("Usia Dosen: " + allData.usia );
            if(allData.jenisKelamin == true){
                System.out.println("Jenis Kelamin Dosen: Pria"  );
            } else{
                System.out.println("Jenis Kelamin Dosen: Wanita"  );
            }
            System.out.println("---------------------------------------");
        }
        System.out.println(" ");
        arrayDataDosen04.dataSemuaDosen(arrayDosen);
        System.out.println(" ");
        arrayDataDosen04.jumlahDosenPerJenisKelamin(arrayDosen);
        System.out.println(" ");
        arrayDataDosen04.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        System.out.println(" ");
        arrayDataDosen04.infoDosenPalingTua(arrayDosen);
        System.out.println(" ");
        arrayDataDosen04.infoDosenPalingMuda(arrayDosen);
        System.out.println(" ");
    }
}
