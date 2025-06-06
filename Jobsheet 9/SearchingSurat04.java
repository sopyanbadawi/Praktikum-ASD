public class SearchingSurat04 {

    
    void cariMahasiswa(String cari, StackSurat04 data) {
        int posisi = -1;
        for (int i = data.top; i >=0; i--) {
            Surat04 surat = data.stack[i];
            if (surat.namaMahasiswa.equalsIgnoreCase(cari)) {
                posisi = i;
                if (surat.jenisIzin == 's' || surat.jenisIzin == 'S') {
                    System.out.printf("Surat telah ditemukan.\nNama: %s\nId Surat: %s\nKelas: %s\nKeterangan: Sakit\nDurasi: %s Jam\n"
                                     , surat.namaMahasiswa, surat.idSurat, surat.kelas, surat.durasi);
                }
                if (surat.jenisIzin == 'i' || surat.jenisIzin == 'I') {
                    System.out.printf("Surat telah ditemukan.\nNama: %s\nId Surat: %s\nKelas: %s\nKeterangan: Izin\nDurasi: %s Jam\n"
                                     , surat.namaMahasiswa, surat.idSurat, surat.kelas, surat.durasi);
                }
            }
        }

        if (posisi == -1) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}