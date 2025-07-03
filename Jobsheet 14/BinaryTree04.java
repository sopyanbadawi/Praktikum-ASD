public class BinaryTree04 {
    Node04 root;

    BinaryTree04() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa04 mahasiswa) {
        Node04 newNode = new Node04(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node04 current = root;
            Node04 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node04 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node04 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traverseInOrder(Node04 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node04 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node04 getSuccessor(Node04 del) {
        Node04 successor = del.right;
        Node04 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node04 parent = root;
        Node04 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //jika punya 2 anak
                Node04 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa04 mahasiswa) {
        if (isEmpty()) {
            root = new Node04(mahasiswa);
        } else {
            Node04 current = root;
            while (true) {
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    if (current.left == null) {
                        current.left = new Node04(mahasiswa);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
                    if (current.right == null) {
                        current.right = new Node04(mahasiswa);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break; // IPK sudah ada
                }
            }
        }
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
    
        Node04 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("\nMahasiswa dengan IPK terendah: ");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
        }
        
        Node04 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("\nMahasiswa dengan IPK tertinggi: ");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        
        System.out.println("\nMahasiswa dengan IPK di atas " + ipkBatas + ":");
        Node04 current = root;
        Node04 prev = null;
        
        while (current != null) {
            if (current.left == null) {
                // Proses node saat ini
                if (current.mahasiswa.ipk > ipkBatas) {
                    current.mahasiswa.tampilInformasi();
                }
                current = current.right;
            } else {
                // Temukan predecessor
                prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }
                
                if (prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    prev.right = null;
                    // Proses node saat ini
                    if (current.mahasiswa.ipk > ipkBatas) {
                        current.mahasiswa.tampilInformasi();
                    }
                    current = current.right;
                }
            }
        }
    }
}   