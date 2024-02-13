package soal5;

import java.util.Scanner;

public class SoalStrings {
    public static void calculateLength(String pertama, String kedua) {
        System.out.println(pertama.length() + kedua.length());
    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void joinAndUppercase(String pertama, String kedua) {
        pertama = capitalize(pertama);
        kedua = capitalize(kedua);
        System.out.println(String.join(" ", pertama, kedua));
    }

    public static void lexicographicalComparison(String pertama, String kedua) {
        // returns < 0 then the String calling the method is lexicographically first
        // (comes first in a dictionary)

        // returns == 0 then the two strings are lexicographically equivalent

        // returns > 0 then the parameter passed to the compareTo method is
        // lexicographically first.

        if (pertama.compareTo(kedua) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pertama = scanner.nextLine();
        String kedua = scanner.nextLine();
        scanner.close();

        System.out.println("=====Result=====");

        calculateLength(pertama, kedua);
        lexicographicalComparison(pertama, kedua);
        joinAndUppercase(pertama, kedua);
    }

}
