public class Mahasiswa04 {
    String nama, kelas, nim;
    double ipk;

    Mahasiswa04() {

    }

    Mahasiswa04(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);

    }
}
