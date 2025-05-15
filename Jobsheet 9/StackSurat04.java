public class StackSurat04 {
    Surat04[] stack;
    int size, top;

    StackSurat04(int size) {
        this.size = size;
        stack = new Surat04[size];
        top = -1;
    }

    public boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat04 surat) {
        if (!IsFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Isi Stack Penuh! Tidak bisa menambahkan data lagi");
        }
    }

    public Surat04 pop() {
        if (!IsEmpty()) {
            Surat04 n = stack[top];
            top--;
            return n;
        } else {
            System.out.println("Stack masih kosong! Tidak ada surat yang bisa diverifikasi");
            return null;
        }
    }

    public Surat04 peek() {
        if (!IsEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack masih kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }
    
    //public void print() {
    //    for (int i = top; i >= 0; i--) {
    //        System.out.println("Nama\tID Surat\tKelas\tJenis Izin\tDurasi");
    //        if (stack[i].jenisIzin == 's' || stack[i].jenisIzin == 'S') {
    //            System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].idSurat + "\t" + stack[i].kelas + "\t" + "Sakit" + "\t" + stack[i].durasi);
    //        }
    //        if (stack[i].jenisIzin == 'i' || stack[i].jenisIzin == 'I') {    
    //            System.out.println(stack[i].namaMahasiswa + "\t" + stack[i].idSurat + "\t" + stack[i].kelas + "\t" + "Izin" + "\t" + stack[i].durasi);
    //        }
            
    //    }
    //    System.out.println("");
    //} (Belum)


}

