public class AntrianKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max;
    int telahKRS;
    int jmlMhs = 30;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah Mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " behasil masuk ke antrian.");
    }

    public MahasiswaKRS layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        MahasiswaKRS mhs = data[front];
        front = (front + 1) % max;
        size--;
        telahKRS++;
        return mhs;
    }

    public void lihat2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            data[front].tampilkanData();
            data[front + 1].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatTerbelakang() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int jmlSudahKRS() {
        return telahKRS;
    }

    public int jmlBelumKRS() {
        return (jmlMhs - telahKRS);
    }

    public void kosongkanAntrian() {
        size = front =  0;
        rear = -1;
    }
}
