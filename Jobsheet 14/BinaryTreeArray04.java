public class BinaryTreeArray04 {
    int idxLast;
    Mahasiswa04[] dataMahasiswa;

    BinaryTreeArray04() {
        this.dataMahasiswa = new Mahasiswa04[10];
    }

    void populateData(Mahasiswa04 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traversInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traversInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traversInOrder(2*idxStart+2);
            }
        }
    }
    
    void traversPreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversPreOrder(2*idxStart+1);
                traversPreOrder(2*idxStart+2);
            }
        }
    }

    void add(Mahasiswa04 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Kapasitas (array) sudah penuh, tidak bisa menambahkan data");
        }
    }
}
