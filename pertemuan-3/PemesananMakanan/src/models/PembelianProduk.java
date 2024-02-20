package models;

public class PembelianProduk {
    private Produk produk;
    private int qty;

    public PembelianProduk(Produk produk, int qty) {
        this.produk = produk;
        this.qty = qty;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQty() {
        return qty;
    }
}
