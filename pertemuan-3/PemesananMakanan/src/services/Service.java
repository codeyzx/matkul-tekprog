package services;

import java.util.ArrayList;
import java.util.List;

import models.Penjualan;
import models.Produk;

public class Service {
    private List<Produk> produk = new ArrayList<>();
    private List<Penjualan> penjualan = new ArrayList<>();

    public Service() {
        addDefaultProduct();
    }

    public void addDefaultProduct() {
        produk.add(new Produk("Mie Goreng", 4000, 80));
        produk.add(new Produk("Nasi Goreng", 8000, 70));
        produk.add(new Produk("Bakso", 12000, 60));
        produk.add(new Produk("Soto Ayam", 10000, 50));
        produk.add(new Produk("Nasi Padang", 15000, 40));
        produk.add(new Produk("Ayam Goreng", 12000, 30));
        produk.add(new Produk("Ikan Bakar", 20000, 50));
        produk.add(new Produk("Nasi Uduk", 10000, 60));
        produk.add(new Produk("Martabak", 15000, 70));
        produk.add(new Produk("Es Teh Manis", 5000, 80));
        produk.add(new Produk("Es Jeruk", 6000, 90));
        produk.add(new Produk("Es Campur", 8000, 100));
        produk.add(new Produk("Sate Ayam", 15000, 40));
        produk.add(new Produk("Gado-gado", 12000, 60));
        produk.add(new Produk("Mie Ayam", 10000, 80));
        produk.add(new Produk("Nasi Goreng Seafood", 15000, 90));
        produk.add(new Produk("Sushi Roll", 20000, 70));
        produk.add(new Produk("Pizza", 25000, 60));
        produk.add(new Produk("Pisang Goreng", 5000, 50));
        produk.add(new Produk("Es Krim", 10000, 40));

    }

    public void addProduk(Produk p) {
        produk.add(p);
    }

    public void addPenjualan(Penjualan p) {
        penjualan.add(p);
    }

    public List<Produk> getProduk() {
        return produk;
    }

    public List<Penjualan> getPenjualan() {
        return penjualan;
    }
}