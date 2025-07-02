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
}
