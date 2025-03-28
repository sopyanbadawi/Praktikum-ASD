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

    void SortDSC() {
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
}
