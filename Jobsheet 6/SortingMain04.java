public class SortingMain04 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        int b[] = {30,20,2,8,14};
        int c[] = {40,10,4,9,3};
        Sorting04 dataurut1 = new Sorting04(a, a.length);
        Sorting04 dataurut2 = new Sorting04(b, b.length);
        Sorting04 dataurut3 = new Sorting04(c, c.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.SelectSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
