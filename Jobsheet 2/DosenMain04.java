public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dsn1 = new Dosen04();
        dsn1.idDosen = "DS1205";
        dsn1.nama = "Abim Mustawa";
        dsn1.statusAktif = true;
        dsn1.thBergabung = 2012;
        dsn1.bidangKeahlian = "Dasar Pemrograman";
        dsn1.tampilkanInformasi();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilkanInformasi();

        Dosen04 dsn2 = new Dosen04("D1502", "Ka Abi Muhammad", true, 2015, "Aljabar Linear");
        dsn2.tampilkanInformasi();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Sistem Operasi");
        dsn2.tampilkanInformasi();
    }
}
