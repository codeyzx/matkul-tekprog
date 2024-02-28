package models;

import utils.enums.FilmKategori;

public class DVDFilm extends DVD {
    String[] pemeran;
    String sutradara;
    FilmKategori kategori;

    public DVDFilm(String judul, String[] pemeran, String sutradara, String publisher, FilmKategori kategori,
            int stok) {
        super(judul, publisher, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Pemeran: ");
        for (String actor : pemeran) {
            if (pemeran.length == 1 || actor.equals(pemeran[pemeran.length - 1])) {
                System.out.print(actor);
            } else {
                System.out.print(actor + ", ");
            }
        }
        System.out.println("\nSutradara: " + sutradara);
        System.out.println("Kategori: " + kategori.getDescription());
    }
}
