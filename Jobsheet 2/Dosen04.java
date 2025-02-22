import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dosen04 {
    String idDosen, nama, bidangKeahlian;
    int thBergabung;
    boolean statusAktif;

    void tampilkanInformasi() {
        System.out.println("Masukkan ID Dosen: " + idDosen);
        System.out.println("Masukkan nama lengkap Dosen: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + thBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " tahun");
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen telah diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif") + "\n");
    }

    int hitungMasaKerja(int thSekarang) {
        return thSekarang - thBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian + "\n");

    }

    public Dosen04() {
    } 

    public Dosen04(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.thBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
