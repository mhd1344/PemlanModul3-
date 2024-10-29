import java.util.List;

public class Display {
    public static void displayReceipt(String buyerName, List<String> bookTitles, List<Double> bookPrices,
                                      double subtotal, double discountAmount, double taxAmount,
                                      double totalCost, double finalCost) {
        System.out.println("\nNama Pembeli: " + buyerName);
        System.out.println("Nama Buku dan Harga:");
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println(bookTitles.get(i) + ": " + bookPrices.get(i));
        }
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Diskon: " + discountAmount);
        System.out.println("Pajak: " + taxAmount);
        System.out.println("Total Harga: " + totalCost);
        System.out.println("Total Yang Harus Dibayar: " + finalCost);
    }
}
