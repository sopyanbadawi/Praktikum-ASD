import java.util.Scanner;
public class Fungsi04{

    static Scanner sc = new Scanner(System.in);
    static String[] cabangToko = {
        "Royal Garden 1",
        "Royal Garden 2",
        "Royal Garden 3",
        "Royal Garden 4"
    };

    static int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static double aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
    
    public static void main(String[] args) {
        
        tabelTokoBunga();
        System.out.println();
        pendapatanCabang();
        System.out.println();
        jumlahStockRoyalGarden4();
    }

    static void tabelTokoBunga(){
        System.out.println("=== Tabel Toko ===");
        System.out.println("Cabang Toko    | Aglonema | Keladi | Alocasia | Mawar |");
        for (int i = 0; i < cabangToko.length; i++) {
            System.out.println(cabangToko[i] + " | " + stock[i][0] + " | " + stock[i][1] + " | " + stock[i][2] + " | " + stock[i][3] + " | ");
        }
    }

    static void pendapatanCabang(){
        System.out.println("=== Pendapatan Setiap Cabang ===");
        for (int i = 0; i < cabangToko.length; i++) {
            int pendapatan = 0;
            pendapatan += stock[i][0] * aglonema;
            pendapatan += stock[i][1] * keladi;
            pendapatan += stock[i][2] * alocasia;
            pendapatan += stock[i][3] * mawar;
            System.out.println(cabangToko[i] + " : Rp " + pendapatan);
        }
    }

    static void jumlahStockRoyalGarden4(){
        System.out.println("==== Jumlah Stock Royal Garden 4 (Pengurangan stok karena ada bunga yang mati) ===");
        int aglonema4 = stock[3][0] - 1;
        int keladi4 = stock[3][1] - 2;
        int alocasia4 = stock[3][2] - 0;
        int mawar4 = stock[3][3] - 5;
        
        System.out.println("Aglonema : " + aglonema4);
        System.out.println("Keladi : " + keladi4);
        System.out.println("Alocasia : " + alocasia4);
        System.out.println("Mawar : " + mawar4);
    }
}