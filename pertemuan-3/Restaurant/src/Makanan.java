public class Makanan {
    private int id;
    private String nama;
    private double harga;
    private int stok;

    public Makanan(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilMakanan() {
        System.out.println(id + " | " + nama + " \t[" + stok + "] \tRp. " + harga);
    }
}
