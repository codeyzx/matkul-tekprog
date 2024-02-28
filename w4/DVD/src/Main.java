import java.util.Scanner;

import controllers.DVDController;
import services.DVDService;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        DVDController controller = new DVDController();
        DVDService service = new DVDService();

        while (isRunning) {
            Utils.clearScreen();
            System.out.println("\nMenu:");
            System.out.println("1. Input DVD Film");
            System.out.println("2. Input DVD Musik");
            System.out.println("3. Tampilkan DVD Film");
            System.out.println("4. Tampilkan DVD Musik");
            System.out.println("5. Tampilkan Semua DVD");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Utils.clearScreen();
                    controller.inputDVDFilm(scanner, service);
                    Utils.waitForEnter(scanner);
                    break;
                case 2:
                    Utils.clearScreen();
                    controller.inputDVDMusik(scanner, service);
                    Utils.waitForEnter(scanner);
                    break;
                case 3:
                    Utils.clearScreen();
                    controller.tampilkanDVD("Film", service);
                    Utils.waitForEnter(scanner);
                    break;
                case 4:
                    Utils.clearScreen();
                    controller.tampilkanDVD("Musik", service);
                    Utils.waitForEnter(scanner);
                    break;
                case 5:
                    Utils.clearScreen();
                    controller.tampilkanDVD("", service);
                    Utils.waitForEnter(scanner);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    Utils.waitForEnter(scanner);
            }
        }

        scanner.close();
    }

}
