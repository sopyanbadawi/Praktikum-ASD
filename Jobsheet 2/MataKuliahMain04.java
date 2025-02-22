public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.nama = "Daspro";
        mk1.kodeMK = "MK23412";
        mk1.sks = 3;
        mk1.jmlJam = 5;
        mk1.tampilkanInformasi();
        mk1.tambahJam(3);
        mk1.tampilkanInformasi();
        mk1.kurangJam(9);
        mk1.tampilkanInformasi();
        mk1.kurangJam(5);
        mk1.tampilkanInformasi();

        MataKuliah04 mk2 = new MataKuliah04("Matematika Dasar", "MK3312", 3, 6);
        mk2.tampilkanInformasi();
    }
}
