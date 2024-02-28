package models;

abstract class DVD {
    String judul;
    String publisher;
    int stok;

    public DVD(String judul, String publisher, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public void displayInfo() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Stok: " + stok);
    }
}
