import java.util.Scanner;

public class RestaurantMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        String more = "";
        do {
            System.out.println("Menu Makanan");
            menu.tampilMenuMakanan();
            System.out.print("Pesan nomor makanan: ");
            int nomor = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Jumlah: ");
            int jumlah = scanner.nextInt();
            menu.pesanMenuMakanan(nomor, jumlah);
            System.out.print("Tambahkan produk lain? (y/n): ");
            more = scanner.next();
            if (more.equalsIgnoreCase("n")) {
                break;
            }
        } while (more.equalsIgnoreCase("y"));
    }
}
