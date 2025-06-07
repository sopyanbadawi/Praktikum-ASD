public class DoubleLinkedList {
    Node04 head;
    Node04 tail;

    DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addFirst(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    } 

    public void addLast(Mahasiswa04 data) {
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node04 current = head;
        if (isEmpty()) {
            System.out.println("Warning! Linked List Masih Kosong");
        }
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Node04 search(String nim) {
        Node04 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah: " );
        head.data.tampil();
        if (head == tail) {
            head = tail= null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah: " );
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void insertAfter(String keyNIM, Mahasiswa04 data) {
        Node04 current = head;

        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }

        Node04 newNode = new Node04(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("node berhasil disisipkan setelah NIM " + keyNIM);
    }

    public void addAt(int index, Mahasiswa04 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node04 newNode = new Node04(data);
            Node04 current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah elemen, menambahkan di akhir.");
                addLast(data);
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode; 
                }
                current.next = newNode;
            }
        }
    }

    public void removeAfter(String keyNim) {
        
        Node04 current = head;

        if (isEmpty()) {
        System.out.println("List kosong. Tidak ada yang bisa dihapus.");
        return;
        }
        

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        if (current.next != null) {
            Node04 removeAfter = current.next;
            current.next = removeAfter.next;
            if (removeAfter.next != null) {
                removeAfter.next.prev = current;
            } else {
                tail = current; 
            }
            System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
        } else {
            System.out.println("Tidak ada node setelah NIM " + keyNim + ".");
        }

    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang dihapus.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node04 current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Index melebihi jumlah data yang ada, tidak ada yang dihapus.");
                return;
            }
            if (current == tail) {
                removeLast();
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List Kosong, tidak ada yang ditampilkan.");
        } else {
            tail.data.tampil();
        }
    }
    
    public int getIdx(String nim) {
        Node04 current = head;
        int index = 0;
        while (current != null) {
            if (current.data.nama.equals(nim)) {
                return index; 
            }
            current = current.next;
            index++;
        }
        return -1; 
    }

    public int getTotalSize() {
        Node04 current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
