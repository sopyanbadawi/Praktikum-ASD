public class DataDosen04 {
    Dosen04[] dataDosen = new Dosen04[10];
    int idx;

    void tambah(Dosen04 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if (dataDosen[0] == null) {
            System.out.println("Belum ada data!!!");
            
        } else {
            for (Dosen04 dsn : dataDosen) {
                    dsn.tampilData();
                    System.out.println("-----------------------");
                }
        }
    }

    void SortASC() {
        if (dataDosen[0] == null) {
            System.out.println("Belum ada data!!!");
        } else {
            for (int i = 0; i < dataDosen.length; i++) {
                for (int j = 1; j < dataDosen.length - i; j++) {
                    if (dataDosen[j-1].usia > dataDosen[j].usia) {
                        Dosen04 temp = dataDosen[j];
                        dataDosen[j] = dataDosen[j-1];
                        dataDosen[j-1] = temp;
                    }
                }
            }
        }
    }

    void SortDSC() {
        if (dataDosen[0] == null) {
            System.out.println("Belum ada data!!!");
        } else {
            for (int i = 0; i < dataDosen.length - 1; i++) {
                int max = i;
                for (int j = 1; j < dataDosen.length; j++) {
                    if (dataDosen[j].usia > dataDosen[max].usia) {
                        max = j;
                    }
                }
                Dosen04 temp = dataDosen[max];
                dataDosen[max] = dataDosen[i];
                dataDosen[i] = temp;
            }
        }
    }

    void InsertSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen04 temp = dataDosen[i];
            int j = i;
            while (j >= 0 && dataDosen[j].usia > temp.usia) {
                 dataDosen[j+1] = dataDosen[j];
                 j--;
            }
            dataDosen[j+1] = temp;
        }
    }

    int sequentialSearching(String cariNama) {
        int posisi = -1;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cariNama)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilSearchNama(String cariNama, int pos) {
        if (pos != -1) {
            System.out.println("Nama: " + dataDosen[pos].nama);
            System.out.println("Kode: " + dataDosen[pos].kode);
            System.out.println("Usia: " + dataDosen[pos].usia);
            if (dataDosen[pos].jenisKelamin) { // default true = laki-laki, false = perempuan
                System.out.println("Jenis Kelamin: Laki-Laki");
            } else {
                System.out.println("Jenis Kelamin: Perempuam ");
            }
        } else {
            System.out.println("Data dosen dengan nama: " + cariNama + " tidak ditemukan");
        }
    }

    void tampilSearchUsia(int cariUsia, int pos) {
        if (pos != -1) {
            System.out.println("Nama: " + dataDosen[pos].nama);
            System.out.println("Kode: " + dataDosen[pos].kode);
            System.out.println("Usia: " + dataDosen[pos].usia);
            if (dataDosen[pos].jenisKelamin) { // default true = laki-laki, false = perempuan
                System.out.println("Jenis Kelamin: Laki-Laki");
            } else {
                System.out.println("Jenis Kelamin: Perempuam ");
            }
        } else {
            System.out.println("Data dosen dengan usia: " + cariUsia + " tidak ditemukan");
        }
    }
    
    int findBinarySearch(int cariUsia, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left)/2;
            if (cariUsia == dataDosen[mid].usia) {
                return (mid);
            } else if (dataDosen[mid].usia > cariUsia) {
                return findBinarySearch(cariUsia, left, mid-1);
            } else {
                return findBinarySearch(cariUsia, mid+1, right);
            }
        }
        return -1;
    }
}
