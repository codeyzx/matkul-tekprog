import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Makanan> makanan = new ArrayList<>();

    public Restaurant() {
        initializeData();
    }

    public void initializeData() {
        makanan.add(new Makanan(1, "Bala-Bala", 1000.0, 20));
        makanan.add(new Makanan(2, "Gehu", 1000.0, 20));
        makanan.add(new Makanan(3, "Tahu", 1000.0, 0));
        makanan.add(new Makanan(4, "Molen", 1000.0, 20));
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < makanan.size(); i++) {
            makanan.get(i).tampilMakanan();
        }
    }

    public void pesanMenuMakanan(int nomor, int jumlah) {
        Makanan makanan = this.makanan.get(nomor - 1);
        if (makanan.getStok() >= jumlah) {
            System.out.println(jumlah + " " + makanan.getNama() + " terjual!");
            makanan.setStok(makanan.getStok() - jumlah);
        } else {
            System.out.println("Stok " + makanan.getNama() + " tidak cukup!");
        }
    }

}
