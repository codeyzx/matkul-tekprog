package utils;

import java.util.Scanner;

public class Utils {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void waitForEnter(Scanner scanner) {
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine(); // Wait for Enter key
    }
}
