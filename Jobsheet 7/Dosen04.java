public class Dosen04 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    Dosen04(String kd, String name, Boolean jk, int age) {
        nama = name;
        kode = kd;
        jenisKelamin = jk;
        usia = age;
    }

    Dosen04() {

    }

    void tampilData() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        if (jenisKelamin) { // default true = laki-laki, false = perempuan
            System.out.println("Jenis Kelamin: Laki-Laki");
        } else {
            System.out.println("Jenis Kelamin: Perempuam ");

        }


    }
}
