package models;

import extensions.CurrencyFormatter;

public class Penjualan {
    private String id;
    private PembelianProduk[] produk;
    private double total;

    public Penjualan(PembelianProduk[] produk, double total) {
        this.id = "INV" + (int) (Math.random() * 1000);
        this.produk = produk;
        this.total = total;
    }

    public void display() {
        System.out.println("==================================");
        System.out.println("Invoice: " + id);
        System.out.println("==================================");
        for (PembelianProduk product : produk) {
            System.out.println(product.getProduk().getNama() + " ("
                    + CurrencyFormatter.toCurrency(product.getProduk().getHarga()) + ") x" + product.getQty() + " = "
                    + CurrencyFormatter.toCurrency(product.getProduk().getHarga() * product.getQty()));
        }
        System.out.println("==================================");
        System.out.println("Total Harga: " + CurrencyFormatter.toCurrency(total));
        System.out.println("==================================");
    }

}
