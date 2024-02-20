import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.PembelianProduk;
import models.Penjualan;
import models.Produk;
import services.Service;
import extensions.CurrencyFormatter;
import extensions.Utils;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Service service = new Service();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            Utils.clearScreen();
            switch (choice) {
                case 1:
                    makeSale();
                    break;
                case 2:
                    viewSales();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini. Sampai jumpa lagi!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Buat Pesanan");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    private static void makeSale() {
        List<PembelianProduk> cart = new ArrayList<>();
        List<Produk> products = service.getProduk();
        if (products.isEmpty()) {
            System.out.println("Tiada produk yang tersedia.");
            return;
        }

        System.out.println("Produk yang tersedia:");
        for (int i = 0; i < products.size(); i++) {
            Produk product = products.get(i);
            System.out.println(
                    (i + 1) + ". " + product.getNama() + " " + CurrencyFormatter.toCurrency(product.getHarga()) + " ("
                            + product.getStok() + " stok) ");
        }
        String addMore = "";
        do {
            System.out.print("Tambahkan produk yang ingin dibeli:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > products.size()) {
                System.out.println("Tidak ada produk dengan nomor tersebut, silakan coba lagi.");
                continue;
            }

            Produk selectedProduct = products.get(choice - 1);
            System.out.print("Masukkan jumlah yang ingin dibeli: ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            if (qty < 1 || qty > selectedProduct.getStok()) {
                System.out.println("Jumlah yang dimasukkan tidak valid, silakan coba lagi.");
                continue;
            }

            selectedProduct.setStok(selectedProduct.getStok() - qty);
            PembelianProduk pembelianProduk = new PembelianProduk(selectedProduct, qty);
            cart.add(pembelianProduk);

            System.out.print("Tambahkan produk lain? (y/n): ");
            addMore = scanner.nextLine();
            if (addMore.equalsIgnoreCase("n")) {
                break;
            }

        } while (addMore.equalsIgnoreCase("y"));

        if (cart.isEmpty()) {
            System.out.println("Tidak ada produk yang dibeli.");
            return;
        }

        double total = 0;
        PembelianProduk[] pembelianProduk = new PembelianProduk[cart.size()];
        for (PembelianProduk product : cart) {
            double subtotal = product.getProduk().getHarga() * product.getQty();
            total += subtotal;
            pembelianProduk[cart.indexOf(product)] = product;
        }

        Penjualan p = new Penjualan(pembelianProduk, total);
        service.addPenjualan(p);
    }

    private static void viewSales() {
        List<Penjualan> sales = service.getPenjualan();
        if (sales.isEmpty()) {
            System.out.println("Tidak ada pesanan. Silakan buat pesanan terlebih dahulu.");
            return;
        }

        System.out.println("Menu yang dipesan:");
        for (Penjualan sale : sales) {
            sale.display();
        }
    }

}
