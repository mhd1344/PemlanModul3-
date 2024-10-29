import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ini kelas BuyBook
 */
public class BuyBook {

    public static final double HARGA_PAJAK = 0.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String buyerName;

        System.out.print("Masukkan Nama Pembeli: ");
        buyerName = scanner.next();

        List<String> judulBuku = new ArrayList<>();
        List<Double> hargaBuku = new ArrayList<>();

        boolean addingBooks = true;
        while (menambahkanBuku(addingBooks)) {
            System.out.print("Masukkan Judul Buku: ");
            String title = scanner.next();
            judulBuku.add(title);

            System.out.print("Masukkan Harga Buku: ");
            double price = scanner.nextDouble();
            hargaBuku.add(price);

            System.out.print("Ingin menambahkan buku lagi? (ya/tidak): ");
            String response = scanner.next();
            addingBooks = response.equalsIgnoreCase("ya");
        }

        System.out.print("Masukkan Diskon: ");
        double discountPercentage = scanner.nextDouble();

        double subtotal1 = 0;
        for (double price : hargaBuku) {
            subtotal1 += price;
        }
        double subtotal = subtotal1;
        double discountAmount = calculateDiscountAmount(subtotal, discountPercentage);
        double taxAmount = calculateTaxAmount(subtotal, HARGA_PAJAK);
        double totalCost = calculateTotalCost(subtotal, discountAmount, taxAmount);
        double finalCost = calculateFinalCost(totalCost);

        Display.displayReceipt(buyerName, judulBuku, hargaBuku, subtotal, discountAmount, taxAmount, totalCost, finalCost);
    }

    private static boolean menambahkanBuku(boolean addingBooks) {
        return addingBooks;
    }

    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100);
    }

    public static double calculateTaxAmount(double subtotal, double taxRate) {
        return subtotal * taxRate;
    }

    public static double calculateTotalCost(double subtotal, double discountAmount, double taxAmount) {
        return subtotal - discountAmount + taxAmount;
    }

    /**
     *
     * Ini adalah sebuah Method untuk menghitung Jumlah harga buku yang dibeli
     *
     */
    public static double calculateFinalCost(double totalCost) {
        return totalCost;
    }

}
