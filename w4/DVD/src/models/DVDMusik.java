package models;

import utils.enums.MusikKategori;

public class DVDMusik extends DVD {
    String penyanyi;
    String produser;
    String[] topHits;
    MusikKategori kategori;

    public DVDMusik(String judul, String penyanyi, String produser, String publisher, String[] topHits,
            MusikKategori kategori,
            int stok) {
        super(judul, publisher, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.print("Top Hits: ");
        for (String hit : topHits) {
            if (topHits.length == 1 || hit.equals(topHits[topHits.length - 1])) {
                System.out.print(hit);
            } else {
                System.out.print(hit + ", ");
            }
        }
        System.out.println("\nKategori: " + kategori.getDescription());
    }
}
