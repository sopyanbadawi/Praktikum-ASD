import java.util.Scanner;
public class MahasiswaDemo04 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
    Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
    Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
    Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
    Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
    Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);



    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

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
