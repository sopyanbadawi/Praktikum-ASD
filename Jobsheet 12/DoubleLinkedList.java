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


}
