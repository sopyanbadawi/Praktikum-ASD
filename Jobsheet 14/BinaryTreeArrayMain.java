public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();
        
        Mahasiswa04 mhs1 = new Mahasiswa04("244160121", "Ali", "A", 3.57);
        Mahasiswa04 mhs2 = new Mahasiswa04("244160221", "Badar", "B", 3.41);
        Mahasiswa04 mhs3 = new Mahasiswa04("244160185", "Candra", "C", 3.75);
        Mahasiswa04 mhs4 = new Mahasiswa04("244160220", "Dewi", "B", 3.35);

        Mahasiswa04 mhs5 = new Mahasiswa04("244160131", "Devi", "A", 3.48);
        Mahasiswa04 mhs6 = new Mahasiswa04("244160205", "Ehsan", "D", 3.61);
        Mahasiswa04 mhs7 = new Mahasiswa04("244160170", "Fizi", "B", 3.86);
        Mahasiswa04 mhs8 = new Mahasiswa04("244160171", "Kak Rose", "C", 3.66);

        Mahasiswa04[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traversInOrder(0);
        
        bta.add(mhs8);
        System.out.println("\nPreOrder Traversal Mahasiswa: ");
        bta.traversPreOrder(0);
    }
}
