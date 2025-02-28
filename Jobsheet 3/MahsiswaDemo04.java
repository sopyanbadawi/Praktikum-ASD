import java.util.Scanner;
public class MahsiswaDemo04 {
    public static void main(String[] args) {
        Mahasiswa04[] arrayOfMahasiswa = new Mahasiswa04[3];
        Scanner sc = new Scanner(System.in);
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa04();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            arrayOfMahasiswa[i].nim = sc.nextLine(); 
            System.out.print("Nama: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine(); 
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }

        for (int i = 0; i < 3; i++) {                           //pertanyaan 1
            System.out.println("Data Mahasiswa ke-" + (i+1));   //pertanyaan 1
            arrayOfMahasiswa[i].cetakInfo();                    //pertanyaan 1
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));           //pertanyaan 1
            System.out.println("NIM: " + arrayOfMahasiswa[i].nim);      //pertanyaan 1
            System.out.println("Nama: " + arrayOfMahasiswa[i].nama);    //pertanyaan 1
            System.out.println("Kelas: " + arrayOfMahasiswa[i].kelas);  //pertanyaan 1
            System.out.println("IPK: " + arrayOfMahasiswa[i].ipk);      //pertanyaan 1
            System.out.println("---------------------------------");  //pertanyaan 1
        }

        arrayOfMahasiswa[0] = new Mahasiswa04();            //percobaan
        arrayOfMahasiswa[0].nim = "244107060033";           //percobaan
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI"; //percobaan
        arrayOfMahasiswa[0].kelas = "SIB-1E";               //percobaan
        arrayOfMahasiswa[0].ipk = (float) 3.75;             //percobaan

        arrayOfMahasiswa[1] = new Mahasiswa04();            //percobaan
        arrayOfMahasiswa[1].nim = "2341720172";             //percobaan
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH"; //percobaan
        arrayOfMahasiswa[1].kelas = "TI-2A";                //percobaan
        arrayOfMahasiswa[1].ipk = (float) 3.36;             //percobaan

        arrayOfMahasiswa[2] = new Mahasiswa04();            //percobaan
        arrayOfMahasiswa[2].nim = "244107023006";           //percobaan
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";   //percobaan
        arrayOfMahasiswa[2].kelas = "TI-2E";                //percobaan
        arrayOfMahasiswa[2].ipk = (float) 3.80;             //percobaan

        System.out.println("NIM: " + arrayOfMahasiswa[0].nim);      //percobaan
        System.out.println("NAMA: " + arrayOfMahasiswa[0].nama);    //percobaan
        System.out.println("KELAS: " + arrayOfMahasiswa[0].kelas);  //percobaan
        System.out.println("IPK: " + arrayOfMahasiswa[0].ipk);      //percobaan
        System.out.println("---------------------------------");  //percobaan
        System.out.println("NIM: " + arrayOfMahasiswa[1].nim);      //percobaan
        System.out.println("NAMA: " + arrayOfMahasiswa[1].nama);    //percobaan
        System.out.println("KELAS: " + arrayOfMahasiswa[1].kelas);  //percobaan
        System.out.println("IPK: " + arrayOfMahasiswa[1].ipk);      //percobaan
        System.out.println("---------------------------------");  //percobaan
        System.out.println("NIM: " + arrayOfMahasiswa[2].nim);      //percobaan
        System.out.println("NAMA: " + arrayOfMahasiswa[2].nama);    //percobaan
        System.out.println("KELAS: " + arrayOfMahasiswa[2].kelas);  //percobaan
        System.out.println("IPK: " + arrayOfMahasiswa[2].ipk);      //percobaan
        System.out.println("---------------------------------");  //percobaan
    }
}
