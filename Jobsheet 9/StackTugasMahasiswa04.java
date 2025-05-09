public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int size, top;

    StackTugasMahasiswa04(int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }
    
    public boolean IsFull(){
        if (top == size - 1) {
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

    public void push(Mahasiswa04 mhs) {
        if (!IsFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Isi Stack Penuh! Tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa04 pop() {
        if (!IsEmpty()) {
            Mahasiswa04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack masih kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa04 peek() {
        if (!IsEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack masih kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
