public class MataKuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jmlJam;
    
    void tampilkanInformasi() {
        System.out.println("Masukkam nama lengkap mata kuliah: " + nama);
        System.out.println("Masukkan kode mata kuliah: " + kodeMK);
        System.out.println("Masukkan jumlah sks: " + sks);
        System.out.println("Masukkan jumlah jam: " + jmlJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        this.jmlJam += jam;
    }

    void kurangJam(int jam) {
        if (jmlJam > jam) {
            this.jmlJam -= jam;
        }else {
            System.out.println("Pengurangan tidak dapat dilakukan!");
        }
    }

    public MataKuliah04() {
    }

    public MataKuliah04(String nameMK, String kode, int sks, int jmlJam) {
        nama = nameMK;
        kodeMK = kode;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }
}
