import java.util.Scanner;
public class MataKuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode = null, nama = null, dummy = null;
        int sks = 0, jmlJam = 0, jmlMatkul;
        
        System.out.print("Masukkan banyak data mata kuliah yang ingin didata: "); //pertanyaan 4
        jmlMatkul = sc.nextInt();                                                   //pertanyaan 4
        sc.nextLine();
        MataKuliah04[] arrayOfMataKuliah = new MataKuliah04[jmlMatkul];             //pertanyaan 4


        for (int i = 0; i < arrayOfMataKuliah.length; i++) {                    //pertanyaan2
            arrayOfMataKuliah[i] = new MataKuliah04 (kode, nama, sks, jmlJam);  //pertanyaan2
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jmlJam, i, dummy); //pertanyaan2
        }
        
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {                        //percobaan
            System.out.println("Data Mata Kuliah ke-" + (i + 1));                   //percobaan
            System.out.println("Kode\t\t: " + arrayOfMataKuliah[i].kode);           //percobaan
            System.out.println("Nama Mata Kuliah: " + arrayOfMataKuliah[i].nama);   //percobaan
            System.out.println("SKS\t\t: " + arrayOfMataKuliah[i].sks);             //percobaan
            System.out.println("Jumlah jam\t: " + arrayOfMataKuliah[i].jmlJam);     //percobaan
            System.out.println("-----------------------------------");            //percobaan
        }


        for (int i = 0; i < arrayOfMataKuliah.length; i++) {    //pertanyaan 3
            System.out.println("Data Mata Kuliah ke-" + (i+1)); //pertanyaan 3
            arrayOfMataKuliah[i].cetakInfo();                   //pertanyaan 3
        }

        

    }
}
